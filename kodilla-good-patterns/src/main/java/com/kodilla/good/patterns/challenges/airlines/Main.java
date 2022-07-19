package com.kodilla.good.patterns.challenges.airlines;

public class Main {
    public static void main(String[] args) {
        Flights flights = new Flights();
        FlightFinder flightFinder = new FlightFinder();

        System.out.println("\nFlights from Poland:\n"
                +flightFinder.findFlightFrom(flights.createFlight(),"Poland"));

        System.out.println("\nFlights to Germany:\n"
                +flightFinder.findFlightTo(flights.createFlight(),"Germany"));

        System.out.println("\nFlights from Cyrpus to Poland they are via:\n"
                +flightFinder.findFlightBetween(flights.createFlight(),"Cyprus","Poland"));
    }
}
