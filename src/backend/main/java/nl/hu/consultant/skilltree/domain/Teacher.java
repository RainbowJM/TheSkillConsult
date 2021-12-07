package nl.hu.consultant.skilltree.domain;

import nl.hu.consultant.security.domain.User;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private int id;

    @JoinColumn
    @OneToMany(cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Group> groups;

    @Transient
    private User user;

    public Teacher(int id, List<Group> groups, User user) {
        this.id = id;
        this.groups = groups;
        this.user = user;
    }

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
