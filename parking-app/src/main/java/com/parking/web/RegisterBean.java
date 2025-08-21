package com.parking.web;

import com.parking.model.User;
import com.parking.store.UserStore;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class RegisterBean implements Serializable {
    private String email;
    private String name;
    private String password;

    public String register() {
        if (UserStore.getInstance().exists(email)) {
            return null;
        }
        UserStore.getInstance().save(new User(email, name, password));
        return "login?faces-redirect=true";
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
