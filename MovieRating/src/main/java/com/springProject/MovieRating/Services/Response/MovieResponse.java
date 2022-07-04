package com.springProject.MovieRating.Services.Response;

import org.springframework.stereotype.Service;

import com.springProject.MovieRating.domain.Genre;
import com.springProject.MovieRating.domain.Movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class MovieResponse {
	
	private String title;
	private double rating;
	private Genre genre;
	
}
