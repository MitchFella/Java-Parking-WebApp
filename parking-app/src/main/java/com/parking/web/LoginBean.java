package com.parking.web;

import com.parking.model.User;
import com.parking.store.UserStore;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {
    private String email;
    private String password;
    private User current;

    @PostConstruct
    public void init() {}

    public String login() {
        User u = UserStore.getInstance().find(email);
        if (u != null && u.getPassword().equals(password)) {
            current = u;
            return "index?faces-redirect=true";
        }
        // stay on page; you can add growl messages in the xhtml
        return null;
    }

    public String logout() {
        current = null;
        email = null;
        password = null;
        return "index?faces-redirect=true";
    }

    public boolean isLoggedIn() { return current != null; }
    public User getCurrent() { return current; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
