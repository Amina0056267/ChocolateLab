package com.bnta.chocolate.Controllers;


import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/estate")
public class EstateController {


        @Autowired
        EstateService estateService;

        @GetMapping
        public ResponseEntity<List<Estate>> getAllEstate() {
            List<Estate> estate = estateService.getAllEstate();
            return new ResponseEntity<>(estate, HttpStatus.OK);

        }

        @PostMapping
        public ResponseEntity<Estate> addEstate(@RequestBody Estate estate) {
            Estate savedEstate = estateService.saveEstate(estate);
            return new ResponseEntity<>(savedEstate, HttpStatus.CREATED);

        }
    }
