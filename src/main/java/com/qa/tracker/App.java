package com.qa.tracker;

import java.util.Date;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qa.tracker.entity.Booking;
import com.qa.tracker.entity.Movie;
import com.qa.tracker.entity.Showing;

import com.qa.tracker.repository.BookingRepository;
import com.qa.tracker.repository.MovieRepository;
import com.qa.tracker.repository.ShowingRepository;

@SpringBootApplication
public class App {
	
	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	ShowingRepository showingRepository;


	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		Date date = new Date();
		Stream.of("Beethoven","Garfield").forEach(title->{
			Stream.of("Romance and Passion","Psychological Thriller").forEach(genre->{
				Stream.of("18","U").forEach(classification->{
					Movie movie = new Movie(title,genre,classification);
					
					Showing showing = new Showing(date);
					Booking booking1 = new Booking(1,1,1,1);
					Booking booking2 = new Booking(0,3,2,0);
					
					movie.addShowing(showing);
					showing.addBooking(booking1);
					showing.addBooking(booking2);
					
					movieRepository.save(movie);
					showingRepository.save(showing);
					bookingRepository.save(booking1);
					bookingRepository.save(booking2);
				});
			});
		});
	}
}
