package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class ContentBasedFilter implements Filter {

    @Override
    public String[] getRecommendations(String movie) {
        // get recommendations based on content filtration
        return new String[] {"Spiderman" , "Superman", "Batman"};
    }
}
