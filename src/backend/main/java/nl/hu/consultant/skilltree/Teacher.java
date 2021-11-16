package nl.hu.consultant.skilltree;

import nl.hu.consultant.security.User;

import java.util.List;

public class Teacher extends User {
    private List<Class> classes;

    public Teacher(int id, String username, String password, String firstName, String lastName) {
        super(id, username, password, firstName, lastName);
    }

    public Teacher(int id, String username, String password, String firstName, String lastName, List<Class> classes) {
        super(id, username, password, firstName, lastName);
        this.classes = classes;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
}
