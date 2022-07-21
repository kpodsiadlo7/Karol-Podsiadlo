package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

   @Test
    void testCalculations(){
       //Given
       ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
       Calculator calculator = context.getBean(Calculator.class);
       double a = 7;
       double b = 4;
       double addResult = 11;
       double subResult = 3;
       double mulResult = 28;
       double divResult = 1.75;
       //When
       double add = calculator.add(a,b);
       double sub = calculator.sub(a,b);
       double mul = calculator.mul(a,b);
       double div = calculator.div(a,b);
       //Then
       assertEquals(addResult,add,0.01);
       assertEquals(subResult,sub,0.01);
       assertEquals(mulResult,mul,0.01);
       assertEquals(divResult,div,0.01);
   }
}
