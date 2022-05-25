package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {

    private final List<Continent> continentsWorld;

    public World(List<Continent> continentsWorld) {
        this.continentsWorld = continentsWorld;
    }

    public BigDecimal getPeopleQuantity(){
        return continentsWorld.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country::getPeopleQuantityInWorld)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum.add(current));
    }
}
