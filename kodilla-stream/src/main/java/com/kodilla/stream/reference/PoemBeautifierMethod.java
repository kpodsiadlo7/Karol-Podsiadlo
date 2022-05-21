package com.kodilla.stream.reference;

import java.util.Random;

public class PoemBeautifierMethod {

    public static String textToLowerCase(String text){
        return text.toLowerCase();
    }

    public static String ABCBeforeText(String text){
        return "ABC " +text;
    }

    public static String randomIntToText(String text){
        Random random = new Random();
        int ran = random.nextInt(300);
        String resultText = text + ran;
        return resultText;
    }
}
