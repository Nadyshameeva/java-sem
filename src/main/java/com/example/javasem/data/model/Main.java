package com.example.javasem.data.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Main {
    
    private Double temp;

    
    @SerializedName("feels_like")
    private Double feelsLike;

    
    @SerializedName("temp_min")
    private Double tempMin;

    
    @SerializedName("temp_max")
    private Double tempMax;

    
    private Double pressure;

    
    private Double humidity;
}
