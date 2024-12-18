package com.example.javasem.data.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Cloud {
    
    @SerializedName("all")
    private Double percent;
}
