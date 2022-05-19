package com.kodilla.testing.weather.mock;                                     // [1]

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {


    @Mock
    private Temperatures temperaturesMock;
    @Test
    void testCalculateForecastWithMock(){
        //Given
        Map<String,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Kostrzyn",33.1);
        temperaturesMap.put("Gorzów",32.2);
        temperaturesMap.put("Poznań",30.3);
        temperaturesMap.put("Szczecin",44.9);
        temperaturesMap.put("Gdańsk",22.9);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5,quantityOfSensors);
    }

    @Test
    void testCalculateAvgTemperaturesMock(){
        //Given
        Map<String,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Kostrzyn",33.1);
        temperaturesMap.put("Gorzów",32.2);
        temperaturesMap.put("Poznań",30.3);
        temperaturesMap.put("Szczecin",44.9);
        temperaturesMap.put("Gdańsk",22.9);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        weatherForecast.calcAvgTemperatures(temperaturesMap);
        //When
        double expectedAvg = weatherForecast.calcAvgTemperatures(temperaturesMap);
        //Then
        Assertions.assertEquals(6.44,expectedAvg);
    }

    @Test
    void testCalculateMedianTemperatureMock(){
        //Given
        Map<String,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Kostrzyn",33.1);
        temperaturesMap.put("Gorzów",32.2);
        temperaturesMap.put("Poznań",30.3);
        temperaturesMap.put("Szczecin",44.9);
        temperaturesMap.put("Gdańsk",22.9);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        weatherForecast.calcMedianTemperatures(temperaturesMap);
        //When
        double expectedMedian = weatherForecast.calcMedianTemperatures(temperaturesMap);
        //Then
        Assertions.assertEquals(32.2,expectedMedian);
    }
}