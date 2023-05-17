package com.me.movielogger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.me.movielogger.model.Movie;
import com.me.movielogger.service.MovieService;

import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/search/{title}")
    public ResponseEntity<List<Movie>> findMovieByTitle(@RequestParam("title") String title) {
        return ResponseEntity.ok(MovieService.findMovieByTitle(title));
    }
}
