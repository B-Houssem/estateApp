package com.BHoussem.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/createOwner")
    public ResponseEntity<?> createOwner() {
        try {
            String firstname;
            String lastname;
            String email;
            String password;


            Owner owner = Owner.createOwner(firstname, lastname, email, password);
            return new ResponseEntity<>(owner, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to create Owner: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteCreateOwnerMapping")
    public ResponseEntity<?> deleteCreateOwnerMapping() {
        try {
            ownerService.deleteCreateOwnerMapping();
            return new ResponseEntity<>("Successfully deleted Owner creation mapping", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to delete Owner creation mapping: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}