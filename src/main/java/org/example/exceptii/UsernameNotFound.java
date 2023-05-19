package org.example.exceptii;

public class UsernameNotFound extends Exception {
    private final String username;

    public UsernameNotFound(String username) {
        super(String.format("Credentiale invalide %s.", username));
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}