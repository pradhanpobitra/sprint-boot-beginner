package io.datajek.spring.basics.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter filter;

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter.getClass().getSimpleName());
        return filter.getRecommendations(movie);
    }
}
