package com.qa.tracker.service;

import java.util.List;

import com.qa.tracker.entity.Movie;

public interface MovieService {
	Movie getMovieById(Integer movieId);
	List<Movie> getAllMovies();
    
}
