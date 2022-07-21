package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    private double val;

    public void displayValue(String operation, double val){
        System.out.println(operation +" result: " +val);
    }
}
