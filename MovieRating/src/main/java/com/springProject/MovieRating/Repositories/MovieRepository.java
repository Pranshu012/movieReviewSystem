package com.springProject.MovieRating.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springProject.MovieRating.domain.Genre;
import com.springProject.MovieRating.domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	public Movie findByTitle(String title);
	

	@Query(value="select * from movie_table m where m.genre= ? "
			+ "order by rating desc limit 5",nativeQuery = true)
	public List<Movie> findByGenre(String genre);
}
