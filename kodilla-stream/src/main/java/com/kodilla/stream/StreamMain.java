package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.reference.PoemBeautifierMethod;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("example text lower to upper case", (text -> text.toUpperCase()));
        poemBeautifier.beautify("EXAMPLE2 TEXT UPPER TO LOWER CASE", PoemBeautifierMethod::textToLowerCase);
        poemBeautifier.beautify("example3 text", PoemBeautifierMethod::ABCBeforeText);
        poemBeautifier.beautify("example4 text with random numbers ", PoemBeautifierMethod::randomIntToText);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
