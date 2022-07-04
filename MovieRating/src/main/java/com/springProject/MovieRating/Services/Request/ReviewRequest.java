package com.springProject.MovieRating.Services.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProject.MovieRating.Repositories.MovieRepository;
import com.springProject.MovieRating.Services.AdminService;
import com.springProject.MovieRating.domain.Genre;
import com.springProject.MovieRating.domain.Movie;
import com.springProject.MovieRating.domain.Review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ReviewRequest {
	
	
	
	
	private String movieReview;
	
	private double movieRating;
	
	private Long movieId;
	
	
	
	public Review toReview() {		
		
		return Review.builder().movieReview(movieReview).movieRating(movieRating).
				movie(Movie.builder().movieId(movieId).build()).build();
	}

}
