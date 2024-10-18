package com.example.demo.demos.web;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    public double calculateTax(double income) {
        // 这里只是一个示例，具体的计算逻辑需要根据当地税法来实现
        double tax = 0;
        if (income > 3500) { // 假设3500是免税额度
            tax = (income - 3500) * 0.1; // 假设税率为10%
        }
        return tax;
    }
}