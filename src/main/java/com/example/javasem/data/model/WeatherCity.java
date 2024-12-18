package com.example.javasem.data.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class WeatherCity {
    private String name;

    private List<Weather> weather;

    private Main main;

    private Wind wind;

    @SerializedName("clouds")
    private Cloud cloud;

    private Rain rain;

    private Snow snow;

    @SerializedName("dt_txt")
    private String dateTxt;
}
