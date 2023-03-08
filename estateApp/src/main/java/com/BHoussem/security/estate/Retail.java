package com.BHoussem.security.estate;

import jakarta.persistence.Entity;

@Entity
class Retail extends Estate {
    public Retail() {}

    public Retail(String type, double superficial, String offerType, String owner, String estatePictureUrl, String phone, String address, double price) {
        super(type, superficial, offerType, owner, estatePictureUrl, phone, address, price);
    }
}
