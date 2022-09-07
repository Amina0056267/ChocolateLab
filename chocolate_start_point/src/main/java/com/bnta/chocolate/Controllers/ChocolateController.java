package com.bnta.chocolate.Controllers;


import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.services.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/chocolate")
public class ChocolateController {

    @Autowired
    ChocolateService chocolateService;
    @GetMapping
    public ResponseEntity<List<Chocolate>>getAllChocolates(){
        List<Chocolate>chocolates = chocolateService.getAllChocolate();
                return new ResponseEntity<>(chocolates, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Chocolate> addChocolate(@RequestBody Chocolate chocolate){
        Chocolate savedChocolate = chocolateService.saveChocolate(chocolate);
        return new ResponseEntity<>(savedChocolate, HttpStatus.CREATED);

    }

    }