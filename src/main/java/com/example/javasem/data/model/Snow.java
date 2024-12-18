package com.example.javasem.data.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Snow {
    @SerializedName("1h")
    private Double speed;
}
