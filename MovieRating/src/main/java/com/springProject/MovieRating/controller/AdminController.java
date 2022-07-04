package com.springProject.MovieRating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springProject.MovieRating.Services.AdminService;
import com.springProject.MovieRating.Services.Request.MovieRequest;
import com.springProject.MovieRating.Services.Response.MovieResponse;



@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired 
	AdminService adminService;
	
	
	@PostMapping("/movie/add")
	public ResponseEntity<MovieResponse> addMovie(@RequestBody MovieRequest movieRequest){
		
		return new ResponseEntity<>(adminService.addMovie(movieRequest.toMovie()).toMovieResponse(),HttpStatus.CREATED);
	}

	@GetMapping("/movie/find")
	ResponseEntity<MovieResponse> findMovie(@RequestParam String title){
		
		return new ResponseEntity<>(adminService.findMovie(title).toMovieResponse(),HttpStatus.OK);
	}
}
