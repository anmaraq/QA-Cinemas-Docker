package com.qa.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.tracker.entity.Movie;
import com.qa.tracker.repository.MovieRepository;
import com.qa.tracker.service.MovieService;

@Service
public class MovieServiceimpl implements MovieService {
	
	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movie getMovieById(Integer movieId) {
		return movieRepository.findOne(movieId);
	}



	
}
