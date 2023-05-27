package com.driver;

public class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(String str) {
        super("movie not found");
    }
}
