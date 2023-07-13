package com.example.calculator_test.service;

import com.example.calculator_test.Service.CalculatorService;
import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamCalcServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    static Stream<Arguments> test1() {
        return Stream.of(
                Arguments.of(5, 10, 15),
                Arguments.of(-10, -5, -15),
                Arguments.of(10, -4, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("test1")
    void plus(int a, int b, int expected) {
        assertEquals(calculatorService.plus(a, b), expected);
    }

    static Stream<Arguments> test2() {
        return Stream.of(
                Arguments.of(5, 10, -5),
                Arguments.of(-10, -5, -5),
                Arguments.of(10, -4, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("test2")
    void minus(int a, int b, int expected) {
        assertEquals(calculatorService.minus(a, b), expected);
    }

    static Stream<Arguments> test3() {
        return Stream.of(
                Arguments.of(5, 10, 50),
                Arguments.of(-10, -5, 50),
                Arguments.of(10, -4, -40)
        );
    }

    @ParameterizedTest
    @MethodSource("test3")
    void multiply(int a, int b, int expected) {
        assertEquals(calculatorService.multiply(a, b), expected);
    }

    static Stream<Arguments> test4() {
        return Stream.of(
                Arguments.of(5, 10, 0.5),
                Arguments.of(-10, -5, 2),
                Arguments.of(10, -4, -2.5)
        );
    }

    @ParameterizedTest
    @MethodSource("test4")
    void divide(double a, double b, double expected) throws RuntimeException {
        assertEquals(calculatorService.divide(a, b), expected);
    }
}
