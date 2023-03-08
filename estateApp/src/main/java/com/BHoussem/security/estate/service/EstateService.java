package com.BHoussem.security.estate.service;

import com.BHoussem.security.estate.Apartment;
import com.BHoussem.security.estate.Building;
import com.BHoussem.security.estate.Estate;
import com.BHoussem.security.estate.Mansion;
import com.BHoussem.security.estate.repository.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateService {

    @Autowired
    private EstateRepository estateRepository;

    public Estate addEstate(Estate estate) {
        return estateRepository.save(estate);
    }

    public void deleteEstate(Long id) {
        estateRepository.deleteById(id);
    }

    public Estate updateEstate(Long id, Estate estate) {
        Estate existingEstate = estateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estate not found"));
        existingEstate.setType(estate.getType());
        existingEstate.setSuperficial(estate.getSuperficial());
        existingEstate.setOfferType(estate.getOfferType());
        existingEstate.setOwner(estate.getOwner());
        existingEstate.setEstatePictureUrl(estate.getEstatePictureUrl());
        existingEstate.setPhone(estate.getPhone());
        existingEstate.setAddress(estate.getAddress());
        existingEstate.setPrice(estate.getPrice());
        if (estate instanceof Mansion) {
            ((Mansion) existingEstate).setNumberOfRooms(((Mansion) estate).getNumberOfRooms());
            ((Mansion) existingEstate).setNumberOfStories(((Mansion) estate).getNumberOfStories());
            ((Mansion) existingEstate).setExtras(((Mansion) estate).getExtras());
        } else if (estate instanceof Apartment) {
            ((Apartment) existingEstate).setNumberOfRooms(((Apartment) estate).getNumberOfRooms());
            ((Apartment) existingEstate).setStoryNumber(((Apartment) estate).getStoryNumber());
        } else if (estate instanceof Building) {
            ((Building) existingEstate).setNumberOfApartments(((Building) estate).getNumberOfApartments());
            ((Building) existingEstate).setNumberOfStories(((Building) estate).getNumberOfStories());
            ((Building) existingEstate).setExtras(((Building) estate).getExtras());
        }
        return estateRepository.save(existingEstate);
    }

    public List<Estate> getAllEstates() {
        return estateRepository.findAll();
    }

    public List<Estate> getEstatesByType(String type) {
        return estateRepository.findByType(type);
    }
}