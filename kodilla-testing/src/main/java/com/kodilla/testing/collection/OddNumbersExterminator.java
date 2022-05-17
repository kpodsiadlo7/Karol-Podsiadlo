package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumbersList = new ArrayList<>();

        for(int num: numbers) {
            if(num %2==0){
                oddNumbersList.add(num);
            }
        }
        return oddNumbersList;
    }

}
