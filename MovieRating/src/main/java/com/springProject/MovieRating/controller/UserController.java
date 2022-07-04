package com.springProject.MovieRating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.springProject.MovieRating.Services.ReviewService;
import com.springProject.MovieRating.Services.Request.ReviewRequest;
import com.springProject.MovieRating.domain.Review;
import com.springProject.MovieRating.domain.Movie;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired 
	ReviewService reviewService;
	
	
	@PostMapping("/review/add")
	public void addReview(@RequestBody ReviewRequest reviewRequest) {
		reviewService.addReview(reviewRequest);
	}
	
	@GetMapping("/find/review")
	public ResponseEntity<Review> getReview(@RequestParam Long reviewId) {
		Review reviewResponse=reviewService.getReview(reviewId);
		return new ResponseEntity<>(reviewResponse,HttpStatus.OK);
	}
	
	@GetMapping("/find/genre")
	public ResponseEntity<List<Movie>> findByGenre(@RequestParam String genre){
		return new ResponseEntity<>(reviewService.findByGenre(genre),HttpStatus.OK);
	}
	
}
