package com.BHoussem.security.estate;

import jakarta.persistence.Entity;

@Entity
public class Building extends Estate{
    private int numberOfApartments;
    private int numberOfStories;
    private String extras;

    public Building() {}

    public Building(int numberOfApartments, int numberOfStories, String extras, String type, double superficial, String offerType, String owner, String estatePictureUrl, String phone, String address, double price) {
        super(type, superficial, offerType, owner, estatePictureUrl, phone, address, price);
        this.numberOfApartments = numberOfApartments;
        this.numberOfStories = numberOfStories;
        this.extras = extras;
    }

// Getters and setters

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
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
