package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int numToAverage[] = {3,13,33,333,21};

        //When
        double calcAvg = ArrayOperations.getAverage(numToAverage);

        //Then
        assertEquals(80.6, calcAvg, 0.01);
    }

}
