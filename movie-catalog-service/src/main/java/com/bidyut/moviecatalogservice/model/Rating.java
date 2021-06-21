package com.bidyut.moviecatalogservice.model;

public class Rating {
	

	private String movieId;
	private int ratting;
	
	public Rating() {
		
	}
	
	public Rating(String movieId, int ratting) {
		super();
		this.movieId = movieId;
		this.ratting = ratting;
	}
	
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getRatting() {
		return ratting;
	}
	public void setRatting(int ratting) {
		this.ratting = ratting;
	}
	
	@Override
	public String toString() {
		return "Rating [movieId=" + movieId + ", ratting=" + ratting + "]";
	}
	
	
	
	

}
