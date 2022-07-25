package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

   @Test
    void testAddMethod(){
       //Given
       ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
       Calculator calculator = context.getBean(Calculator.class);
       double a = 7;
       double b = 4;
       double addResult = 11;
       //When
       double add = calculator.add(a,b);
       //Then
       assertEquals(addResult,add,0.01);
   }

   @Test
   void testSubstractMethod(){
      //Given
      ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
      Calculator calculator = context.getBean(Calculator.class);
      double a = 7;
      double b = 4;
      double subResult = 3;
      //When
      double sub = calculator.sub(a,b);
      //Then
      assertEquals(subResult,sub,0.01);
   }

   @Test
   void testMultiplyMethod(){
      //Given
      ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
      Calculator calculator = context.getBean(Calculator.class);
      double a = 7;
      double b = 4;
      double mulResult = 28;
      //When
      double mul = calculator.mul(a,b);
      //Then
      assertEquals(mulResult,mul,0.01);
   }

   @Test
   void testDivideMethod(){
      //Given
      ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
      Calculator calculator = context.getBean(Calculator.class);
      double a = 7;
      double b = 4;
      double divResult = 1.75;
      //When
      double div = calculator.div(a,b);
      //Then
      assertEquals(divResult,div,0.01);
   }
}
