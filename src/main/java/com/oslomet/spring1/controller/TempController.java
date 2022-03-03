package com.oslomet.spring1.controller;

import com.oslomet.spring1.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController{
    @Autowired
    TempService service;

    @GetMapping("/temp")
    public int getTemp(String mnd){
        return service.getTemp(mnd);
    }
}
