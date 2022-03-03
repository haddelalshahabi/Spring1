package com.oslomet.spring1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//vi lager en klient i static (html-fil "index")

@RestController //Vi legger til dekoratøren for at sprin skal vite at den controllen er en kontroll (vi adder de ved @)
public class HelloController {
    @GetMapping ("/") //er en type dekoratør
    // lager en metode
    public String hei(String navn) {
        return "Hei verden " + navn;
    }
}
