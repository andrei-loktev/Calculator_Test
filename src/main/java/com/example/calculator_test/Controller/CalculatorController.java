package com.example.calculator_test.Controller;

import com.example.calculator_test.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/calculator")
    public class CalculatorController {

        private final CalculatorService calculatorService;

        public CalculatorController(CalculatorService calculatorService) {
            this.calculatorService = calculatorService;
        }

        @GetMapping()
        public String greating() {
            return "Добро пожаловать в калькулятор";
        }

        @GetMapping("/plus")
        public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
            return String.format("%s + %s = %s", a, b, calculatorService.plus(a, b));
        }

        @GetMapping("/minus")
        public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
            return String.format("%s - %s = %s", a, b, calculatorService.minus(a, b));
        }

        @GetMapping("/multiply")
        public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
            return String.format("%s * %s = %s", a, b, calculatorService.multiply(a, b));
        }

        @GetMapping("/divide")
        public String divide(@RequestParam(required = false) double a, @RequestParam(required = false) double b) {
            if (b == 0) {
                return "на ноль делить нельзя";
            }
            return String.format("%s / %s = %s", a, b, calculatorService.divide(a, b));
        }
    }
