package com.example.javasem.data.model;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weather {
    
    private String description;

    
    private String icon;

    public String getIcon() {
        return "https://openweathermap.org/img/wn/" + icon + "@2x.png";
    }
}
