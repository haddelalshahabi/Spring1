package com.oslomet.spring1.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorService {

    public double add(double num1, double num2) throws Exception {
        return num1 + num2;
    }

    public double sub(double num1, double num2) throws Exception {
        return num1 - num2;
    }

    public double mul(double num1, double num2) throws Exception {
        return num1 * num2;
    }

    public double div(double num1, double num2) throws Exception {
        return num1 / num2;
    }
}
