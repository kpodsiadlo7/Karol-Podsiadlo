package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures{

    @Override
    public Map<String,Double> getTemperatures(){
        Map<String,Double> stubResult = new HashMap<>();

        //dummy data
        stubResult.put("Kostrzyn",33.1);
        stubResult.put("Gorzów",32.2);
        stubResult.put("Poznań",30.3);
        stubResult.put("Szczecin",44.9);
        stubResult.put("Gdańsk",22.9);
        return stubResult;
    }
}
