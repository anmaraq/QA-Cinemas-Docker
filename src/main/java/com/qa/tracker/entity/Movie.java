package com.qa.tracker.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {

	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer movieId;
	@Column
	private String movieTitle;
	@Column
	private String movieGenre;
	@Column
	private String movieClassification;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Showing> showings = new HashSet<Showing>();

	public Movie() {}
	
	public Movie(String movieTitle, String movieGenre, String movieClassification) {
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
		this.movieClassification = movieClassification;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieClassification() {
		return movieClassification;
	}
	public void setMovieClassification(String movieClassification) {
		this.movieClassification = movieClassification;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public Set<Showing> getShowings() {
		return showings;
	}
	public void setShowings(Set<Showing> showings) {
		this.showings = showings;
	}
	public void addShowing(Showing showing) {
		this.showings.add(showing);
	}

}
