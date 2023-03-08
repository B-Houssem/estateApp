package com.BHoussem.security.estate;

import com.BHoussem.security.estate.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estate")
public class EstateController {

    @Autowired
    private EstateService estateService;

    @PostMapping("/add")
    public Estate addEstate(@RequestBody Estate estate) {
        return estateService.addEstate(estate);
    }

    @DeleteMapping("/{id}")
    public void deleteEstate(@PathVariable Long id) {
        estateService.deleteEstate(id);
    }

    @PutMapping("/{id}")
    public Estate updateEstate(@PathVariable Long id, @RequestBody Estate estate) {
        return estateService.updateEstate(id, estate);
    }

    @GetMapping("/all")
    public List<Estate> getAllEstates() {
        return estateService.getAllEstates();
    }

    @GetMapping("/{type}")
    public List<Estate> getEstatesByType(@PathVariable String type) {
        return estateService.getEstatesByType(type);
    }
}
