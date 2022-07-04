package com.springProject.MovieRating.domain;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="Review_Table")
public class Review {
	
	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long reviewId;
	
	private String movieReview;
	
	private double movieRating;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn
	private Movie movie;
	
	@CreationTimestamp
	private Date createdDate;
	
	@UpdateTimestamp
	private Date updatedDate;
	
}
