package com.bidyut.movieinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidyut.movieinfoservice.model.MovieInfoService;

@RestController
@RequestMapping("/movies")
public class MovieInfoServiceController {
	
	@RequestMapping("{movieId}")
	public MovieInfoService getMovieInfo(@PathVariable("movieId") String movieId)
	{
		MovieInfoService infoService = new MovieInfoService();
		infoService.setMovieId(movieId);
		infoService.setMovieName("test Name");
		return infoService;
		
	}
	

}
