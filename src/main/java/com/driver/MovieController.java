package com.driver;

import com.driver.Movie;
import com.driver.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService=new MovieService();

    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director director){
        movieService.addDirectory(director);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
    @PutMapping("/add-movie-director-pair")
    public ResponseEntity<String>addMovieDirectorPair(@RequestParam String movie,@RequestParam String director) {
       try {
           movieService.addMovieDirectorPair(movie, director);
           return new ResponseEntity<>("New pair added successfully", HttpStatus.CREATED);
       }catch(Exception e){
           return new ResponseEntity<>("movie not found", HttpStatus.NOT_FOUND);
       }
    }
    @GetMapping("/get-movie-by-name/{name}")
    public ResponseEntity<Movie>getMovieByName(@PathVariable String name){
        Movie movie = movieService.getMovieByName(name);
        try {
            return new ResponseEntity<>(movie, HttpStatus.OK);
        }catch(MovieNotFoundException e) {
            // MovieNotFoundException i=new MovieNotFoundException();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

        }
    }
    @GetMapping("/get-director-by-name/{name}")
    public ResponseEntity<Director>getDirectorByName(@PathVariable String name){
        try {
            Director director = movieService.getDirectorByName(name);
            return new ResponseEntity<>(director, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/get-movies-by-director-name/{director}")
    public ResponseEntity<List<String>>getMoviesByDirectorName(@PathVariable String director){
            List<String> movies = movieService.getMoviesByDirectorName(director);
            return new ResponseEntity<>(movies, HttpStatus.OK);
    }
    @GetMapping("/get-all-movies")
    public ResponseEntity<List<String>>findAllMovies(){
        List<String> allMovies = movieService.getAllmovies();
        return new ResponseEntity<>(allMovies, HttpStatus.OK);
    }
    @DeleteMapping("/delete-director-by-name")
    public ResponseEntity<String>deleteAllDirectorByName(@RequestParam String director){
        movieService.deleteDirector(director);
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }
    @DeleteMapping("/delete-all-directors")
    public ResponseEntity<String>deleteAllDirectors(){
        movieService.deleteAllDirector();
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }


}
