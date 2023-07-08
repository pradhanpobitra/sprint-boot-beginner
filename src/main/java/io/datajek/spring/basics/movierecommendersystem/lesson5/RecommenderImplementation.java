package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter collaborativeFilter;

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + collaborativeFilter.getClass().getSimpleName());
        return collaborativeFilter.getRecommendations(movie);
    }
}
