package com.parking.web;

import com.parking.model.Booking;
import com.parking.store.BookingStore;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@ManagedBean
@SessionScoped
public class BookingBean implements Serializable {
    
    private LocalDate date;
    private Date startTime;         
    private int hours = 1;
    private String spot;
    private String vehicleReg;

    private String lastId; // for confirmation page
    private String filterVehicleReg;

    public String create(String userEmail) {
        Booking b = new Booking(userEmail, vehicleReg, date, startTime, hours, spot);
        BookingStore.getInstance().create(b);
        lastId = b.getId();
        clearForm();
        return "confirmation?faces-redirect=true";
    }

    public List<Booking> forUser(String email) {
        return BookingStore.getInstance().forUser(email);
    }

    public void delete(String id) {
        BookingStore.getInstance().delete(id);
    }

    private void clearForm() {
        vehicleReg = null;
        date = null;
        startTime = null;
        hours = 1;
        spot = null;
    }

    // getters/setters
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Date getStartTime() { return startTime; }
    public void setStartTime(Date startTime) { this.startTime = startTime; }

    public int getHours() { return hours; }
    public void setHours(int hours) { this.hours = hours; }

    public String getSpot() { return spot; }
    public void setSpot(String spot) { this.spot = spot; }

    public String getVehicleReg() { return vehicleReg; }
    public void setVehicleReg(String vehicleReg) { this.vehicleReg = vehicleReg; }

    public String getLastId() { return lastId; }

    public String getFilterVehicleReg() { return filterVehicleReg; }
    public void setFilterVehicleReg(String filterVehicleReg) { this.filterVehicleReg = filterVehicleReg; }
}
