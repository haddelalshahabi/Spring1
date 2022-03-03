package com.oslomet.spring1.controller;

import com.oslomet.spring1.repository.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Oppgave 1 fra ukesoppgaver
@RestController
public class TempController{
    @Autowired
    TempService repository;

    @GetMapping("/temp")
    public int getTemp(String mnd){
        return repository.getTemp(mnd);
    }
}
