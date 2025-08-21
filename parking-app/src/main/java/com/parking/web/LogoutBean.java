package com.parking.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class LogoutBean implements Serializable {
    public String go() { return "index?faces-redirect=true"; }
}
