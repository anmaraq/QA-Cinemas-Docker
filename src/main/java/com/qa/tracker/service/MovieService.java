package com.qa.tracker.service;

import java.util.List;

import com.qa.tracker.dto.TrainerDto;
import com.qa.tracker.entity.Movie;

public interface MovieService {
	List<Movie> getAllMovies();
    
}
