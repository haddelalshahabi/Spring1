package com.oslomet.spring1.controller;


//eks på overføring av et objekt til server

import com.oslomet.spring1.repository.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class KundeController {
    @Autowired
    Kunde repository;

    @GetMapping("/kunde")
    public Kunde returKunde(Kunde innKunde){
        return innKunde;
    }
}