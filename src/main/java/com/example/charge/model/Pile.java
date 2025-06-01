package com.example.charge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pile")
public class Pile {
    @Id
    private String id;

    private String type;
    private boolean state;
    private int totalChargeCount;
    private int totalChargeTime;
    private double totalPower;

    // Getters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalChargeCount() {
        return totalChargeCount;
    }

    public void setTotalChargeCount(int totalChargeCount) {
        this.totalChargeCount = totalChargeCount;
    }

    public int getTotalChargeTime() {
        return totalChargeTime;
    }

    public void setTotalChargeTime(int totalChargeTime) {
        this.totalChargeTime = totalChargeTime;
    }

    public double getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(double totalPower) {
        this.totalPower = totalPower;
    }
}

