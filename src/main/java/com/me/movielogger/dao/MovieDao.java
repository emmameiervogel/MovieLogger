package com.me.movielogger.dao;

import com.me.movielogger.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<Movie, Integer> {
}
