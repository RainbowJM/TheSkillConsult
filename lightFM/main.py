import pandas as pd
from lightfm.evaluation import auc_score

def generate_feature_list(dataframe, features_name):
    """
    Generate features list for mapping 

    Parameters
    ---------
    dataframe: Dataframe
        Pandas Dataframe for Users or Q&A. 
    features_name : List
        List of feature columns name avaiable in dataframe. 

    Returns
    -------
    List of all features for mapping 
    """
    features = dataframe[features_name].apply(
        lambda x: ','.join(x.map(str)), axis=1)
    features = features.str.split(',')
    features = features.apply(pd.Series).stack().reset_index(drop=True)
    return features


def calculate_auc_score(lightfm_model, interactions_matrix,
                        question_features, professional_features):
    """
    Measure the ROC AUC metric for a model. 
    A perfect score is 1.0.

    Parameters
    ----------
    lightfm_model: LightFM model 
        A fitted lightfm model 
    interactions_matrix : 
        A lightfm interactions matrix 
    question_features, professional_features: 
        Lightfm features 

    Returns
    -------
    String containing AUC score 
    """
    score = auc_score(
        lightfm_model, interactions_matrix,
        item_features=question_features,
        user_features=professional_features,
        num_threads=4).mean()
    return score
