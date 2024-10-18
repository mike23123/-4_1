package com.example.demo.demos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxController {

    @Autowired
    private TaxCalculator taxCalculator;

    @GetMapping("/calculate-tax")
    public double calculateTax(@RequestParam double income) {
        return taxCalculator.calculateTax(income);
    }
}