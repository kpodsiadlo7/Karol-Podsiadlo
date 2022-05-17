package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbersList = new ArrayList<>();

        for(int num: numbers) {
            if(num %2==0){
                evenNumbersList.add(num);
            }
        }
        return evenNumbersList;
    }

}
