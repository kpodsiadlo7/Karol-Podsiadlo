package com.kodilla.good.patterns.challenges.airlines;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Flights {

    private final HashMap<Airport, List<Airport>> avaliableFlights;
    private final Airport pol = new Airport("Poland");
    private final Airport ger = new Airport("Germany");
    private final Airport cyp = new Airport("Cyprus");
    private final Airport nld = new Airport("Netherlands");
    private final Airport bel = new Airport("Belgium");
    private final Airport cze = new Airport("Czech Republic");

    public Flights() {
        avaliableFlights = new HashMap<>();
    }

    public HashMap<Airport, List<Airport>> createFlight(){
        avaliableFlights.put(pol, Arrays.asList(nld,cze,cyp,ger));
        avaliableFlights.put(bel, Arrays.asList(cyp,cze,nld));
        avaliableFlights.put(ger, Arrays.asList(bel,pol));
        avaliableFlights.put(cyp, Arrays.asList(bel,cze,nld));
        avaliableFlights.put(nld, Arrays.asList(cyp,ger,cze,pol));
        avaliableFlights.put(cze, Arrays.asList(cyp,ger));

        return avaliableFlights;
    }
}
