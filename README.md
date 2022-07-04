# movieReviewSystem
This is Backend project of movie review website (eg: IMDb, Rotten tomatoes). 
The RESTful APIs for this project are developed using java language and springBoot framework. And for database i had used mySQL and Hibernate for communicating 
with RESTful services.




Highlights of the project: 
	It have storage of movies and it's ratings and reviews.
	It can able to recommend movies based on genre
	It can let user add review and rating for a particular movie

APIs:
	1. Api to add movies and default rating
	2. Api to search movie by title 
	3. Api to return top rated movies by genre ( ex: comedy, thriller, action..)
	4. Api to accept the rating and review for a movie

Functionalities Description:
	1.  Add the movies API ->  by admin ( no authentication required for now) default rating 0 and any one genre
	2.  functionality to search movie by title
	3.  functionality to search multiple movie by genre and sort by highest rating and return top 5
	4.  Add the review and rating of the movie in a separate table on api request. update the main movie table by avg of the total rating available in review table.

