package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class ContentBasedFilter {

    public String[] getRecommendations(String movie) {
        // get recommendations based on content filtration
        return new String[] {"Spiderman" , "Superman", "Batman"};
    }
}
