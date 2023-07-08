package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    @Override
    public String[] getRecommendations(String movie) {
        // get recommendations based on content filtration
        return new String[] {"Spiderman" , "Superman", "Batman"};
    }
}
