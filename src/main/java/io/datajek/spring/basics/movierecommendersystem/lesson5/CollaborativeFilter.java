package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {};
    }
}
