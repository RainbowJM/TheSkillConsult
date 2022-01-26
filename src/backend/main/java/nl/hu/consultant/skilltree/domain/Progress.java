package nl.hu.consultant.skilltree.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Progress {
    @Id
    @GeneratedValue
    @Setter @Getter
    private int id;

    @Setter @Getter
    private int openness;

    @Setter @Getter
    private int culturalEmpathy;

    @Setter @Getter
    private int openmindness;

    @Setter @Getter
    private int adaptability;

    @Setter @Getter
    private int flexibility;

    @Setter @Getter
    private int emotionalStability;

    @Setter @Getter
    private int socialInitiative;

    public Progress() {
    }

    public Progress(int id,
                    int openness,
                    int culturalEmpathy,
                    int openmindness,
                    int adaptability,
                    int flexibility,
                    int emotionalStability,
                    int socialInitiative) {
        this.id = id;
        this.openness = openness;
        this.culturalEmpathy = culturalEmpathy;
        this.openmindness = openmindness;
        this.adaptability = adaptability;
        this.flexibility = flexibility;
        this.emotionalStability = emotionalStability;
        this.socialInitiative = socialInitiative;
    }
}
