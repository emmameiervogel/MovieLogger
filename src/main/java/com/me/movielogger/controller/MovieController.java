package com.me.movielogger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.me.movielogger.model.Movie;
import com.me.movielogger.service.MovieService;

import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/search")
    public ResponseEntity<List<Movie>> searchMovies(@RequestParam("query") String query) {
        return ResponseEntity.ok(MovieService.searchMovies(query));
    }
}
