package com.example.calculator_test.service;

import com.example.calculator_test.Service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void plusPositive() {
        int actual = calculatorService.plus(4, 6);
        assertEquals(10, actual);
    }

    @Test
    void plusNegative() {
        int actual = calculatorService.plus(-14, -6);
        assertEquals(-20, actual);
    }

    @Test
    void minusPositive() {
        int actual = calculatorService.minus(4, 6);
        assertEquals(-2, actual);
    }

    @Test
    void minusNegative() {
        int actual = calculatorService.minus(-14, -6);
        assertEquals(-8, actual);
    }

    @Test
    void multiplyPositive() {
        int actual = calculatorService.multiply(4, 6);
        assertEquals(24, actual);
    }

    @Test
    void multiplyNegative() {
        int actual = calculatorService.multiply(-14, -6);
        assertEquals(84, actual);
    }

    @Test
    void dividePositive() throws RuntimeException{
        double actual = calculatorService.divide(4, 6);
        assertEquals(0.6666666666666666, actual);
    }

    @Test
    void divideNegative() throws RuntimeException{
        double actual = calculatorService.divide(-14, -6);
        assertEquals(2.3333333333333333, actual);
    }

    @Test
    void divideByZero() {
        assertThrows(RuntimeException.class, () -> calculatorService.divide(14, 0));
    }


}
