package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text,PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);
        System.out.println("\nText before and after decorate: \n" +text +"\n" +result);
    }

}
