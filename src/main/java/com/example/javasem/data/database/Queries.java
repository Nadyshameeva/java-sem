package com.example.javasem.data.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Queries {
    public static String getCity() {
        return "select * from weather";
    }

    public static String insertWeatherCity() throws IOException {
        return new String(Files.readAllBytes(Paths.get("src/main/resources/com/example/javasem/queries/insert-weather.sql")));
    }
}
