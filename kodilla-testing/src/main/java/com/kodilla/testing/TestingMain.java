package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        Calculator calculator = new Calculator(3,9);

        int requirementAddAtoB = 12;
        if(calculator.addAtoB() == requirementAddAtoB){
            System.out.println("OK! method add A to B");
        } else {
            System.out.println("ERROR! method add A to B" +" || RESULT: " +calculator.addAtoB() +", REQUIREMENT: " +requirementAddAtoB);
        }

        int requirementSubstractAfromB = -6;
        if(calculator.substractAfromB() == requirementSubstractAfromB){
            System.out.println("OK! method substract A from B");
        } else {
            System.out.println("ERROR! method substract A from B" + " || RESULT: " +calculator.substractAfromB() +", REQUIREMENT: " +requirementSubstractAfromB);
        }

        int requirementSubstractBfromA = 999;
        if(calculator.substractBfromA() == requirementSubstractBfromA){
            System.out.println("OK! method substract B from A");
        } else {
            System.out.println("ERROR! method substract B from A" + " || RESULT: " +calculator.substractBfromA() +", REQUIREMENT: " +requirementSubstractBfromA);
        }
    }
}