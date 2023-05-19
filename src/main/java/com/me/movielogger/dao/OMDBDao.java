package com.me.movielogger.dao;

import

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.util.UriTemplate;

@Configuration
@PropertySource("classpath:omdb-api-key.yml")
public class OMDBDao {
    @Value("api-key")
    private String apiKey;

    private var movieDetailsUrl = UriTemplate("http://www.omdbapi.com/?apikey={apiKey}&t={title}")
}
