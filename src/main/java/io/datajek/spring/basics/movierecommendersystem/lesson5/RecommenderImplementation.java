package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.time.Instant;

@Component
public class RecommenderImplementation {

    private Filter filter;

    public RecommenderImplementation() {
        System.out.println("Constructor of recommender implementation called at " + Instant.now().toString());
    }

    @Autowired
    public void setFilter(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
        System.out.println("collaborative filter dependency injected in recommender implementation at " + Instant.now().toString());
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter.getClass().getSimpleName());
        return filter.getRecommendations(movie);
    }
}
