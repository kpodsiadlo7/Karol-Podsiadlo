package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            //adding 1 celsius degree to current value
            //as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calcAvgTemperatures(Map<String, Double> tempMap) {

        double sum;
        for (Map.Entry<String, Double> temp : temperatures.getTemperatures().entrySet()) {
            sum = +temp.getValue();
            return sum / tempMap.size();
        }
        return 0.0;
    }

    public double calcMedianTemperatures(Map<String, Double> tempMap) {
        List<Double> listToMedian = new ArrayList<>();
        for (Map.Entry<String, Double> temp : temperatures.getTemperatures().entrySet()) {
            listToMedian.add(temp.getValue());
        }

        Collections.sort(listToMedian);
        int middle = listToMedian.size()/2;
        if(listToMedian.size() % 2 == 0){
            return 0.5 * (listToMedian.get(middle).doubleValue() + listToMedian.get(middle-1).doubleValue());
        } else {
            return listToMedian.get(middle).doubleValue();
        }
    }
}


