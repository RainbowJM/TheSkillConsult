import numpy as np


def create_actions(row, unique_actions):
    """Create actions for the user. But it will be erased if he already has one."""
    for col in unique_actions:
        row[f'action_{col}'] = 0
    return row


def predict_scores(row, unique_actions, linreg):
    """Predict how good each action will score for the user."""
    all_actions = []
    for col in unique_actions:
        row[f'action_{col}'] = 1
        pred = linreg.predict([row.values.tolist()])
        all_actions.append(pred)
        row[f'action_{col}'] = 0
    return all_actions


def find_best_actions(all_actions, unique_actions):
    """Find the best actions the user can take in order to have the biggest predicted growth."""
    best_scores = [sum(scores[0]) for scores in all_actions]
    indices = unique_actions[np.argmax(best_scores)]
    return indices


def worst_skill_index(row, skills):
    """Find the index of the worst skill of the user."""
    skills_measure = []
    for col in skills:
        skills_measure.append(row[col])
    return np.argmin(skills_measure)


def best_action_for_worst_skill(row, skills, effect_actions, unique_actions):
    """Find the action that will help the users worst skill to improve most."""
    skill_index = worst_skill_index(row, skills)
    worst_skill_score = row[skills[skill_index]]

    best_improvement = []
    for action in effect_actions:
        best_improvement.append(action[0][skill_index] - worst_skill_score)

    return unique_actions[np.argmax(best_improvement)]


def recommend_action(linreg, unique_actions, row, skills):
    """The recommendation model. It will return the action a user can take to improve the most overall or the action which will
    improve the users worst skill most."""
    row = create_actions(row, unique_actions)  # Create empty actions
    effect_actions = predict_scores(row, unique_actions,
                                    linreg)  # Predict how much influence every action will have on the user

    most_effective_actions = find_best_actions(effect_actions, unique_actions)

    worst_skill_improvement_action = best_action_for_worst_skill(row, skills, effect_actions, unique_actions)

    return [most_effective_actions, worst_skill_improvement_action]
