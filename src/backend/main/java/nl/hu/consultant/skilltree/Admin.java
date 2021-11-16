package nl.hu.consultant.skilltree;

import nl.hu.consultant.security.User;

public class Admin extends User {
    public Admin(int id, String username, String password, String firstName, String lastName) {
        super(id, username, password, firstName, lastName);
    }
}
