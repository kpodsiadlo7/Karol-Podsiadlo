package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args) {
        Flight berPol = new Flight("BERLIN", "POLAND");
        Flight polNyc = new Flight("POLAND", "NEW YORK");
        Flight cypNet = new Flight("CYPRUS", "NETHERLANDS");

        FlightSearcher flightSearcher = new FlightSearcher();


        try {
            boolean existBerPol = flightSearcher.findFlight(berPol);
            System.out.println("Flight " +berPol.getDepartureAirport()
                    +" to "
                    +berPol.getArrivalAirport()
                    +": "
                    +existBerPol);
        } catch (RouteNotFoundException e) {
            System.out.println("Incorrect airport name.");
        }


        try {
            boolean existPolNyc = flightSearcher.findFlight(polNyc);
            System.out.println("Flight " +polNyc.getDepartureAirport()
                    +" to "
                    +polNyc.getArrivalAirport()
                    +": "
                    +existPolNyc);
        } catch (RouteNotFoundException e) {
            System.out.println("Incorrect airport name.");
        }


        try {
            boolean existCypNet = flightSearcher.findFlight(cypNet);
            System.out.println("Flight " +cypNet.getDepartureAirport()
                    +" to "
                    +cypNet.getArrivalAirport()
                    +": "
                    +existCypNet);
        } catch (RouteNotFoundException e) {
            System.out.println("Incorrect airport name.");
        }
    }
}