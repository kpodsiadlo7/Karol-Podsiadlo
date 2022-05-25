package com.kodilla.stream.sand;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SandStorageTestSuite {

    @Test
    void testGetSandBeansQuantity(){
        //Given
        List<SandStorage> contains = new ArrayList<>();
        contains.add(new Europe());
        contains.add(new Asia());
        contains.add(new Africa());

        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for(SandStorage contient: contains){
            totalSand = totalSand.add(contient.getSandBeansQuantity());
        }

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand,totalSand);
    }

    @Test
    void testGetSandBeansQuantityWithRedue(){
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand, totalSand);
    }
}
