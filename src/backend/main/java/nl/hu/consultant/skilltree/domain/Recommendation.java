package nl.hu.consultant.skilltree.domain;

import javax.persistence.*;

@Entity
@Table(name = "Recommendation")
public class Recommendation {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Recommendation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Recommendation() {
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

}
