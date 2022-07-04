package com.springProject.MovieRating.domain;


import javax.persistence.*;

import com.springProject.MovieRating.Services.Response.MovieResponse;

import lombok.*;




@Entity
@Table(name="movie_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class Movie{
	
	
	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
	
	private String title;
	
	private int year;
		
	private String description;
	
	private double rating;
	
	private  Long ratingCount;
	
	@Enumerated(EnumType.STRING)
	private Genre genre;
	
	private String adminName;

	
	public MovieResponse toMovieResponse() {
		return MovieResponse.builder().title(title).genre(genre).rating(rating).build();
	}

	
	
}
