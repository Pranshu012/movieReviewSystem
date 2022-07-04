package com.springProject.MovieRating.Services;

import org.springframework.stereotype.Service;

import com.springProject.MovieRating.Repositories.MovieRepository;
import com.springProject.MovieRating.Services.Request.MovieRequest;
import com.springProject.MovieRating.Services.Response.MovieResponse;
import com.springProject.MovieRating.domain.Movie;

@Service
public class AdminService {

	MovieRepository movieRepository;
	
	public AdminService(MovieRepository movieRepository) {
		this.movieRepository=movieRepository;
	}
	
	public Movie addMovie(Movie movie) {
//		return null;
		return movieRepository.save(movie);
		
	}
	
	public Movie findMovie(String title) {
		return movieRepository.findByTitle(title);
	}
	
	public Movie findMovie(Long movieId)
	{
		return movieRepository.findById(movieId).orElse(null);
	}
}
