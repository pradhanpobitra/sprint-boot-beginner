package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommenderImplementation = new RecommenderImplementation();
		String[] movies = recommenderImplementation.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(movies));
	}
}
