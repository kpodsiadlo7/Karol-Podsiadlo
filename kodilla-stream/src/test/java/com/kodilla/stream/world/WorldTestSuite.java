package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        List<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(new Country("Poland", new BigDecimal("37950000")));
        europeanCountries.add(new Country("Germany", new BigDecimal("83240000")));
        europeanCountries.add(new Country("Netherlands", new BigDecimal("17134872")));

        List<Country> asianCountries = new ArrayList<>();
        asianCountries.add(new Country("Japan", new BigDecimal("125710000")));
        asianCountries.add(new Country("Singapur", new BigDecimal("5850342")));
        asianCountries.add(new Country("Cypr", new BigDecimal("794600")));

        List<Continent> continentsListOfTheWorld = new ArrayList<>();
        continentsListOfTheWorld.add(new Continent(europeanCountries));
        continentsListOfTheWorld.add(new Continent(asianCountries));

        World world = new World(continentsListOfTheWorld);

        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("270679814");
        Assertions.assertEquals(expectedPeopleQuantity,worldPeopleQuantity);
    }
}
