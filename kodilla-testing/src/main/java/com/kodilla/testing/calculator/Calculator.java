package com.kodilla.testing.calculator;

public class Calculator {

    private int a,b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int addAtoB(){
        return a+b;
    }

    public int substractAfromB(){
        return a-b;
    }

    public int substractBfromA() {
        return b - a;
    }
}
