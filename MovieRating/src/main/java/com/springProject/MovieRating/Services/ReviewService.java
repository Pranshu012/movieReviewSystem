package com.springProject.MovieRating.Services;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springProject.MovieRating.Repositories.MovieRepository;
import com.springProject.MovieRating.Repositories.ReviewRepository;
import com.springProject.MovieRating.Services.Request.ReviewRequest;

import com.springProject.MovieRating.domain.Movie;
import com.springProject.MovieRating.domain.Review;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository reviewRepository;
	
	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	AdminService adminService;
	
	 Logger logger = LoggerFactory.getLogger(ReviewService.class);
	 


	public void addReview(ReviewRequest reviewRequest) {
		
		updateRating(reviewRequest);
		Review reviewSaved=reviewRepository.save(reviewRequest.toReview());
		logger.info("Review Provided By You Saved..Thanks!!"+reviewSaved.getReviewId());
	}
	
	public Review getReview(Long reviewId) {
		return reviewRepository.findById(reviewId).orElse(null);
	}
	
	
	public void updateRating(ReviewRequest reviewRequest) {
		
		Movie movie=adminService.findMovie(reviewRequest.getMovieId());
		double rating=movie.getRating();
		Long reviewCount=movie.getRatingCount()+1;
		double movieRating=reviewRequest.getMovieRating()+((reviewRequest.getMovieRating()-rating)/reviewCount);
		movieRating=Math.round(movieRating* 100.0)/100.0;	
		movie.setRating(movieRating);
		movie.setRatingCount(reviewCount);
	}
	
	public List<Movie> findByGenre(String genre){
		return movieRepository.findByGenre(genre);
	}
	
}
