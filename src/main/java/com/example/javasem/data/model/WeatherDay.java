package com.example.javasem.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherDay {
    String icon;
    Integer day;
    Double avgTemp;
    Double maxTemp;
    Double minTemp;
}
