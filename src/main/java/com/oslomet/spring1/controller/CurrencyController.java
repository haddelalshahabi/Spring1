package com.oslomet.spring1.controller;


import com.oslomet.spring1.model.Amount;
import com.oslomet.spring1.repository.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    CurrencyService repository;

    @PostMapping("/load")
    public void load(){
        repository.loadCurrensies();
    }

    @GetMapping("/calc")
    public double calculate(Amount amount){
        System.out.println(amount.getCurrency());
        return repository.calculate(amount);
    }
}
