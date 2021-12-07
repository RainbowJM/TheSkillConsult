package nl.hu.consultant.skilltree.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Skill {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToOne
    private Progress progress;

    @OneToMany
    @JoinColumn
    private List<Recommendation> recommendations;

    public Skill(int id, String name, Progress progress, List<Recommendation> recommendations) {
        this.id = id;
        this.name = name;
        this.progress = progress;
        this.recommendations = recommendations;
    }

    public Skill() {
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
