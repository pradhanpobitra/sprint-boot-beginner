package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.Instant;
import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
		// On providing MovieRecommenderSystemApplication as the primary source for SpringApplication.run(), we would get all the beans used by this application as it is annotated with @SpringBootApplication.
		// SpringApplication.run() returns an ApplicationContext.
		// Spring creates beans in the Spring IOC container and ApplicationContext is the one which manages the beans present in Spring IOC container.
		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);

		System.out.println("Going to call recommend movies method at " + Instant.now().toString());

		String[] movies = recommenderImplementation.recommendMovies("Finding Dory");

		System.out.println(Arrays.toString(movies));
	}
}
