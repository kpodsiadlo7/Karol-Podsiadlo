package com.kodilla.good.patterns.challenges.airlines;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {

    public List<Airport> findFlightFrom(HashMap<Airport, List<Airport>> availableFlight, String flightFrom){
        return availableFlight.entrySet().stream()
                .filter(f -> f.getKey().getAirportName().equals(flightFrom))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Airport> findFlightTo(HashMap<Airport,List<Airport>> availableFlight, String flightTo){
        return availableFlight.entrySet().stream()
                .filter(f -> f.getValue().contains(new Airport(flightTo)))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<Airport> findFlightBetween(HashMap<Airport, List<Airport>> availableFlight, String flightFrom,
                                           String flightTo){

        List<Airport> airportsBetweenFrom = findFlightFrom(availableFlight,flightFrom);
        List<Airport> airportsBetweenTo = findFlightTo(availableFlight,flightTo);
        List<Airport> airportBetween = new ArrayList<>();

        for (Airport portFrom: airportsBetweenFrom){
            for (Airport portTo: airportsBetweenTo){
                if(portFrom == portTo){
                    airportBetween.add(portFrom);
                }
            }
        } return airportBetween;
    }
}
