package com.bidyut.movieratingservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidyut.movierattingservice.model.Rating;
import com.bidyut.movierattingservice.model.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingServiceController {

	@RequestMapping("{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		Rating rating = new Rating();
		rating.setMovieId(movieId);
		rating.setRatting(4);
		return rating;
	}

	@RequestMapping("/users/{userrId}")
	public UserRating getUsersRating(@PathVariable("userrId") String userrId) {

		UserRating userRatting = new UserRating();
		userRatting.setListRating(Arrays.asList(new Rating("100", 3), new Rating("120", 2), new Rating("125", 4)));
		return userRatting;

	}

}
