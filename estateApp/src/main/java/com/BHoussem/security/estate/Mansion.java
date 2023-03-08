package com.BHoussem.security.estate;

import jakarta.persistence.Entity;

@Entity
public
class Mansion extends Estate {

    private int numberOfRooms;
    private int numberOfStories;
    private String extras;

    public Mansion() {}

    public Mansion(int numberOfRooms, int numberOfStories, String extras, String type, double superficial, String offerType, String owner, String estatePictureUrl, String phone, String address, double price) {
        super(type, superficial, offerType, owner, estatePictureUrl, phone, address, price);
        this.numberOfRooms = numberOfRooms;
        this.numberOfStories = numberOfStories;
        this.extras = extras;
    }

    // Getters and setters

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfStories() {
        return numberOfStories;
    }

    public void setNumberOfStories(int numberOfStories) {
        this.numberOfStories = numberOfStories;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }
}