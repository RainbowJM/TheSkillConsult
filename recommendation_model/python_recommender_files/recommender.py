import numpy as np


def create_courses(row, unique_courses):
    """Create courses for the user. But it will be erased if he already has one."""
    for col in unique_courses:
        row[f'course_{col}'] = 0
    return row


def predict_scores(row, unique_courses, linreg):
    """Predict how good each course will score for the user."""
    all_courses = []
    for col in unique_courses:
        row[f'course_{col}'] = 1
        pred = linreg.predict([row.values.tolist()])
        all_courses.append(pred)
        row[f'course_{col}'] = 0
    return all_courses


def find_best_courses(all_courses, unique_courses):
    """Find the best courses the user can take in order to have the biggest predicted growth."""
    best_scores = [sum(scores[0]) for scores in all_courses]
    indices = unique_courses[np.argmax(best_scores)]
    return indices


def worst_skill_index(row, skills):
    """Find the index of the worst skill of the user."""
    skills_measure = []
    for col in skills:
        skills_measure.append(row[col])
    return np.argmin(skills_measure)


def best_course_for_worst_skill(row, skills, effect_courses, unique_courses):
    """Find the course that will help the users worst skill to improve most."""
    skill_index = worst_skill_index(row, skills)
    worst_skill_score = row[skills[skill_index]]

    best_improvement = []
    for course in effect_courses:
        best_improvement.append(course[0][skill_index] - worst_skill_score)

    return unique_courses[np.argmax(best_improvement)]


def recommend_course(linreg, unique_courses, row, skills):
    """The recommendation model. It will return the course a user can take to improve the most overall or the course which will
    improve the users worst skill most."""
    row = create_courses(row, unique_courses)  # Create empty courses
    effect_courses = predict_scores(row, unique_courses,
                                    linreg)  # Predict how much influence every course will have on the user

    most_effective_courses = find_best_courses(effect_courses, unique_courses)

    worst_skill_improvement_course = best_course_for_worst_skill(row, skills, effect_courses, unique_courses)

    return [most_effective_courses, worst_skill_improvement_course]
