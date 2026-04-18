package com.holistic.entity;

public class Professional {
    private String specialization;
    private int experience;
    private boolean availability;

    public Professional(String specialization, int experience, boolean availability) {
        this.specialization = specialization;
        this.experience = experience;
        this.availability = availability;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}