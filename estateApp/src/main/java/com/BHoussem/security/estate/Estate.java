package com.BHoussem.security.estate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Estate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;
    private double superficial;
    private String offerType;
    private String owner;
    private String estatePictureUrl;
    private String phone;
    private String address;
    private double price;

    public Estate() {}

    public Estate(String type, double superficial, String offerType, String owner, String estatePictureUrl, String phone, String address, double price) {
        this.type = type;
        this.superficial = superficial;
        this.offerType = offerType;
        this.owner = owner;
        this.estatePictureUrl = estatePictureUrl;
        this.phone = phone;
        this.address = address;
        this.price = price;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSuperficial() {
        return superficial;
    }

    public void setSuperficial(double superficial) {
        this.superficial = superficial;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEstatePictureUrl() {
        return owner;
    }

    public void setEstatePictureUrl(String owner) {
        this.owner = owner;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
