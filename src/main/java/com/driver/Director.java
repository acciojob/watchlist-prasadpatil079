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

}
