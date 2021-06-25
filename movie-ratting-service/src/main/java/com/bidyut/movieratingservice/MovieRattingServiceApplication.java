package com.bidyut.movieratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieRattingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRattingServiceApplication.class, args);
	}

}
