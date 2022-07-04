package com.springProject.MovieRating.Services.Request;

import org.springframework.stereotype.Service;

import com.springProject.MovieRating.domain.Genre;
import com.springProject.MovieRating.domain.Movie;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequest {
	
	private Genre genre;
	
	private String title;
	
	private String description;
	
	
	public Movie toMovie() {
		
		return Movie.builder().title(title).genre(genre).description(description).rating(0.0).ratingCount((long) 0).adminName("localHost").build();
	}
}
