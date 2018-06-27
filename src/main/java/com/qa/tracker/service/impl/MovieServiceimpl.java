package com.qa.tracker.service.impl;

import com.qa.tracker.converter.TrainerConverter;
import com.qa.tracker.dto.TrainerDto;
import com.qa.tracker.entity.Movie;
import com.qa.tracker.repository.MovieRepository;
import com.qa.tracker.repository.TrainerRepository;
import com.qa.tracker.service.MovieService;
import com.qa.tracker.service.TrainerService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
