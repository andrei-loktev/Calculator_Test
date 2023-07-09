package com.example.calculator_test.Service;

public class CalcServiceImpl extends RuntimeException{
    public CalcServiceImpl() {
    }

    public CalcServiceImpl(String message) {
        super(message);
    }

    public CalcServiceImpl(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcServiceImpl(Throwable cause) {
        super(cause);
    }

    public CalcServiceImpl(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
