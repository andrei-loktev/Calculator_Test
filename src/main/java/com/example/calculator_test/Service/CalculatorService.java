package com.example.calculator_test.Service;

import org.springframework.stereotype.Service;

@Service

public class CalculatorService {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if(b==0){
            throw new RuntimeException();
        }
        return a / b;
    }
}
