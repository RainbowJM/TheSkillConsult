package nl.hu.consultant.skilltree.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Recommendation {
    @Id
    @GeneratedValue
    @Setter @Getter
    private int id;

    @Setter @Getter
    private String name;

    public Recommendation() {
    }

    public Recommendation(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
