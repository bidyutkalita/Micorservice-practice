package com.bidyut.moviecatalogEurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieCatalogEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogEurekaServerApplication.class, args);
	}

}