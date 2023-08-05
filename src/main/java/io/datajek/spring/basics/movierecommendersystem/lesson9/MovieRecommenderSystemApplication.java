package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"io.datajek.spring.basics.movierecommendersystem.lesson10", "io.datajek.spring.basics.movierecommendersystem.lesson9"})
@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
		// On providing MovieRecommenderSystemApplication as the primary source for SpringApplication.run(), we would get all the beans used by this application as it is annotated with @SpringBootApplication.
		// SpringApplication.run() returns an ApplicationContext.
		// Spring creates beans in the Spring IOC container and ApplicationContext is the one which manages the beans present in Spring IOC container.
		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

//		ContentBasedFilter filter = applicationContext.getBean(ContentBasedFilter.class);
//		Movie movie1 = filter.getMovie();
//		Movie movie2 = filter.getMovie();
//		Movie movie3 = filter.getMovie();

//		Movie movie1 = applicationContext.getBean(Movie.class);
//		Movie movie2 = applicationContext.getBean(Movie.class);
//		Movie movie3 = applicationContext.getBean(Movie.class);


		System.out.println("Contentbased filter instance count - " + ContentBasedFilter.getInstances());
		System.out.println("Movie instance count - " + Movie.getInstances());

//		System.out.println(movie1 + "\n" + movie2 + "\n" + movie3);


		System.out.println("content based filter bean present -" + applicationContext.containsBean("contentBasedFilter"));
		System.out.println("collaborative filter bean present -" + applicationContext.containsBean("collaborativeFilter"));
	}
}
