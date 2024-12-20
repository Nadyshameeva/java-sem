package com.example.javasem;

import com.example.javasem.data.api.Request;
import com.example.javasem.data.api.SearchRequest;
import com.example.javasem.data.api.WeatherFewDaysRequest;
import com.example.javasem.data.api.WeatherRequest;
import com.example.javasem.data.model.City;
import com.example.javasem.data.model.SearchCity;
import com.example.javasem.data.model.WeatherCity;
import com.example.javasem.data.model.WeatherFewDays;
import com.example.javasem.exceptions.IncorrectTypeRequest;
import com.example.javasem.exceptions.NullRequest;
import com.example.javasem.exceptions.ReceivingResponseException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.List;

public class WeatherApi {
    private static final Logger logger = LoggerFactory.getLogger(WeatherApi.class);

    public static WeatherCity getWeather(Request request) throws IncorrectTypeRequest, NullRequest, ReceivingResponseException {
        if (request == null) {
            logger.error("Null request Weather City exception");
            throw new NullRequest("Null request Weather City");
        }

        if (!(request instanceof WeatherRequest)) {
            logger.error("Request has not correct type");

            throw new IncorrectTypeRequest("Request has not correct type. Expected WeatherRequest");
        }

        try {
            String response = request.getResponse();

            Gson gson = new Gson();
            WeatherCity weatherCity = gson.fromJson(response, WeatherCity.class);

            logger.info("Response Weather City: {}", weatherCity);

            if (weatherCity == null || weatherCity.getName() == null) {
                throw new ReceivingResponseException("response class is null");
            }

            return weatherCity;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Receiving response Weather City exception: {}", e.getMessage());
            throw new ReceivingResponseException(e.getMessage());
        }
    }

    public static WeatherFewDays getWeatherFewDays(Request request) throws IncorrectTypeRequest, NullRequest, ReceivingResponseException {
        if (request == null) {
            logger.error("Null request Few Days exception");

            throw new RuntimeException("Null request Few Days");
        }

        if (!(request instanceof WeatherFewDaysRequest)) {
            logger.error("Request has not correct type. Expected WeatherFewDaysRequest");

            throw new IncorrectTypeRequest("Request has not correct type. Expected WeatherFewDaysRequest");
        }

        try {
            String response = request.getResponse();

            Gson gson = new Gson();
            WeatherFewDays weatherFewDays = gson.fromJson(response, WeatherFewDays.class);

            logger.info("Response Few Days: {}", weatherFewDays);

            if (weatherFewDays == null) {
                throw new ReceivingResponseException("response class is null");
            }

            return weatherFewDays;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Receiving response Few Days exception: {}", e.getMessage());
            throw new ReceivingResponseException(e.getMessage());
        }
    }

    public static SearchCity getSearchCity(Request request) throws IncorrectTypeRequest, NullRequest, ReceivingResponseException {
        if (request == null) {
            logger.error("Null request Search City exception");

            throw new RuntimeException("Null request Search City");
        }

        if (!(request instanceof SearchRequest)) {
            logger.error("Request has not correct type. Expected SearchRequest");

            throw new IncorrectTypeRequest("Request has not correct type. Expected SearchRequest");
        }

        try {
            String response = request.getResponse();

            Gson gson = new Gson();
            Type cityListType = new TypeToken<List<City>>() {}.getType();
            List<City> cities = gson.fromJson(response, cityListType);

            SearchCity searchCity = new SearchCity();
            searchCity.setList(cities);

            logger.info("Response Search City: {}", searchCity);

            return searchCity;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Receiving response Search City exception: {}", e.getMessage());
            throw new ReceivingResponseException(e.getMessage());
        }
    }
}
