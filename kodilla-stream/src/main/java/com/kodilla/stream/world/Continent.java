package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    private final List<Country> countriesList;

    public Continent(List<Country> countriesList) {
        this.countriesList = countriesList;
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }
}
