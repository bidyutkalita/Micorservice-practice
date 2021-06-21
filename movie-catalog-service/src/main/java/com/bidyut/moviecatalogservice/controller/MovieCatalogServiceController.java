package com.bidyut.moviecatalogservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.bidyut.moviecatalogservice.model.CatalogItem;
import com.bidyut.moviecatalogservice.model.MovieInfoService;
import com.bidyut.moviecatalogservice.model.Rating;
import com.bidyut.moviecatalogservice.model.UserRating;

/**
 * this microservice will take user request and call two microservice
 * and gether all the infor mation and respond to user with movie rating details
 * 
 * @author bidyut.kalita
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogServiceController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	WebClient.Builder webClientBuilder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		Rating ratings = new Rating();
		// rating.setMovieId(movieId);
		ratings.setRatting(4);

//		List<Rating> listRating = Arrays.asList(ratings);

		UserRating listRating=webClientBuilder.build()
				.get()
				.uri("http://localhost:8012/movie-rating-service/rating/users/" + userId)
				.retrieve()
				.bodyToMono(UserRating.class)
				.block();
		
		System.out.println(listRating);
		
		return listRating.getListRating().stream().map(rating -> {
			// MovieInfoService infoService =
			// restTemplate.getForObject("http://localhost:8011/movie-info-service/movies/"+rating.getMovieId(),
			// MovieInfoService.class);

			MovieInfoService infoService = webClientBuilder.build()
					.get()
					.uri("http://localhost:8011/movie-info-service/movies/" + rating.getMovieId())
					.retrieve()
					.bodyToMono(MovieInfoService.class)
					.block();

			CatalogItem items = new CatalogItem();
			items.setDesc("test");
			items.setName(infoService.getMovieName());
			items.setRatting(rating.getRatting());
			return items;
		}).collect(Collectors.toList());

	}

}
