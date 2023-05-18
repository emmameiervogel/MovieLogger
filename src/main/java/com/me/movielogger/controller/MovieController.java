package com.me.movielogger.controller;

import com.me.movielogger.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.me.movielogger.model.Movie;
import com.me.movielogger.service.MovieService;

import java.util.List;

@RestController
@RequestMapping(path="/service")
public class MovieController {

    @Autowired
    private MovieDao movieDao;

    @GetMapping("/search/{title}")
    public ResponseEntity<List<Movie>> findMovieByTitle(@RequestParam("title") String title) {
        return ResponseEntity.ok(MovieService.findMovieByTitle(title));
    }

    @PostMapping("/search/{title}")
    public ResponseEntity<Movie> createNewMovie(@ResponseBody Movie movie){
        return ResponseEntity.ok(MovieService.storeMovieDetails(movie))
    }
}
