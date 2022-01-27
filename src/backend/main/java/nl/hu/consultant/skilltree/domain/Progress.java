package nl.hu.consultant.skilltree.domain;

import javax.persistence.*;

@Entity
@Table(name = "progress")
public class Progress {
    @Id
    @GeneratedValue
    private int id;
    private double openness;
    private double cultural_empathy;
    private double openmindness;
    private double adaptability;
    private double flexibility;
    private double emotional_stability;
    private double social_initiative;

    public Progress(int id, double openness, double cultural_empathy, double openmindness, double adaptability, double flexibility, double emotional_stability, double social_initiative) {
        this.id = id;
        this.openness = openness;
        this.cultural_empathy = cultural_empathy;
        this.openmindness = openmindness;
        this.adaptability = adaptability;
        this.flexibility = flexibility;
        this.emotional_stability = emotional_stability;
        this.social_initiative = social_initiative;
    }

    public Progress() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOpenness() {
        return openness;
    }

    public void setOpenness(double openness) {
        this.openness = openness;
    }

    public double getCultural_empathy() {
        return cultural_empathy;
    }

    public void setCultural_empathy(double cultural_empathy) {
        this.cultural_empathy = cultural_empathy;
    }

    public double getOpenmindness() {
        return openmindness;
    }

    public void setOpenmindness(double openmindness) {
        this.openmindness = openmindness;
    }

    public double getAdaptability() {
        return adaptability;
    }

    public void setAdaptability(double adaptability) {
        this.adaptability = adaptability;
    }

    public double getFlexibility() {
        return flexibility;
    }

    public void setFlexibility(double flexibility) {
        this.flexibility = flexibility;
    }

    public double getEmotional_stability() {
        return emotional_stability;
    }

    public void setEmotional_stability(double emotional_stability) {
        this.emotional_stability = emotional_stability;
    }

    public double getSocial_initiative() {
        return social_initiative;
    }

    public void setSocial_initiative(double social_initiative) {
        this.social_initiative = social_initiative;
    }
}
