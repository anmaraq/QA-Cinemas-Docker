package com.qa.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.tracker.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
}
