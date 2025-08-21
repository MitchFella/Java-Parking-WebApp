package com.parking.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Booking implements Serializable {
    private final String id = UUID.randomUUID().toString();
    private String userEmail;
    private String vehicleReg;
    private LocalDate date;   // booking day
    private Date startTime;   // java.util.Date
    private int hours;        // duration in hours
    private String spot;      // e.g., A12

    public Booking() {}

    public Booking(String userEmail, String vehicleReg, LocalDate date,
                   Date startTime, int hours, String spot) {
        this.userEmail = userEmail;
        this.vehicleReg = vehicleReg;
        this.date = date;
        this.startTime = startTime;
        this.hours = hours;
        this.spot = spot;
    }

    public String getId() { return id; }

    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    public String getVehicleReg() { return vehicleReg; }
    public void setVehicleReg(String vehicleReg) { this.vehicleReg = vehicleReg; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Date getStartTime() { return startTime; }
    public void setStartTime(Date startTime) { this.startTime = startTime; }

    public int getHours() { return hours; }
    public void setHours(int hours) { this.hours = hours; }

    public String getSpot() { return spot; }
    public void setSpot(String spot) { this.spot = spot; }
}
