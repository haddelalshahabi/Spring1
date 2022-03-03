package com.oslomet.spring1.controller;

import com.oslomet.spring1.service.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//eks på overføring av et objekt til server
@RestController
public class KundeController {
    @Autowired
    Kunde service;
    @GetMapping("/")
    public Kunde returKunde(Kunde innKunde){
        return innKunde;
    }
}