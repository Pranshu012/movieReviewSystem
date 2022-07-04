package com.springProject.MovieRating.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springProject.MovieRating.domain.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{
	
	
	
}
