package com.driver;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Director {
    private String name;
    private Integer numberOfMovies;
    private Double imdbRatings ;

    public Director() {
    }

    public Director(String name, Integer numberOfMovies, Double imdbRatings) {
        this.name = name;
        this.numberOfMovies= numberOfMovies;
        this.imdbRatings = imdbRatings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDurationInMin() {
        return numberOfMovies;
    }

    public void setDurationInMin(Integer durationInMin) {
        this.numberOfMovies = numberOfMovies;
    }

    public Double getRatings() {
        return imdbRatings;
    }

    public void setRatings(Double ratings) {
        this.imdbRatings = imdbRatings;
    }
}
