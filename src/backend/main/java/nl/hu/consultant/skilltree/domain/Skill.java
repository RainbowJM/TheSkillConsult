package nl.hu.consultant.skilltree.domain;

import java.util.List;

public class Skill {
    private int id;
    private String name;
    private Progress progress;
    private List<Recommendation> recommendations;

    public Skill(int id, String name, Progress progress, List<Recommendation> recommendations) {
        this.id = id;
        this.name = name;
        this.progress = progress;
        this.recommendations = recommendations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }
}
