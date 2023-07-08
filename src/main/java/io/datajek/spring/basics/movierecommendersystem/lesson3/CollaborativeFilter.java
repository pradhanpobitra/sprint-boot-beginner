package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {};
    }
}
