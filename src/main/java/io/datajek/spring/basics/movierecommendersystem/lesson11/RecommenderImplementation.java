package io.datajek.spring.basics.movierecommendersystem.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public RecommenderImplementation() {
        logger.info("Constructor of recommender implementation called..");
    }

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("Inside RecommenderImplementation setter method...dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    private void postConstruct() {
        logger.info("Inside post construct of RecommenderImplementation..");
    }

    @PreDestroy
    private void preDestroy() {
        logger.info("Destroying recommender implementation bean");
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter.getClass().getSimpleName());
        return filter.getRecommendations(movie);
    }
}
