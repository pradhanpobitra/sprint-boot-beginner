package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie) {
        // 1. do a content-based filtering according to the input movie
        ContentBasedFilter filter = new ContentBasedFilter();
        // 2. return a list of similar movies
        return filter.getRecommendations(movie);
    }
}
