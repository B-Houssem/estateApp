package com.BHoussem.security.estate;

import jakarta.persistence.Entity;

@Entity
public
class Apartment extends Estate {

    private int numberOfRooms;
    private int storyNumber;

    public Apartment() {}

    public Apartment(int numberOfRooms, int storyNumber, String type, double superficial, String offerType, String owner,String estatePictureUrl, String phone, String address, double price) {
        super(type, superficial, offerType, owner, estatePictureUrl, phone, address, price);
        this.numberOfRooms = numberOfRooms;
        this.storyNumber = storyNumber;
    }
    // Getters and setters

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getStoryNumber() {
        return storyNumber;
    }

    public void setStoryNumber(int storyNumber) {
        this.storyNumber = storyNumber;
    }
}