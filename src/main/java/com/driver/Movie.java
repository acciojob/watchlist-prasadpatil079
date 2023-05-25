package com.driver;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    private String name;
    private Integer durationInMin;
    private Double imdbRatings;

    public Movie() {
    }

    public Movie(String name, Integer durationInMin, Double imdbRatings) {
        this.name = name;
        this.durationInMin = durationInMin;
        this.imdbRatings = imdbRatings;
    }
}

