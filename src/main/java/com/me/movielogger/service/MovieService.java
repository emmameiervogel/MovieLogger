package com.me.movielogger.service;

import com.me.movielogger.dao.MovieDao;
import com.me.movielogger.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieService {

    @Autowired
    private MovieDao movieDao;

    public Movie findMovieByTitle(String title) {
        return null;
    }
}
