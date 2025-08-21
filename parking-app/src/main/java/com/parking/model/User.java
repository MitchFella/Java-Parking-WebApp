package com.parking.model;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String email;
    private String name;
    private String password; // plain for demo; replace with hashing later

    public User() {}

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }
    @Override public int hashCode() { return Objects.hash(email); }
}
