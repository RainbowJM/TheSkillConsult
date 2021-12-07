package nl.hu.consultant.skilltree.domain;

import nl.hu.consultant.security.domain.User;

public class Admin {
    private User user;

    public Admin(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
