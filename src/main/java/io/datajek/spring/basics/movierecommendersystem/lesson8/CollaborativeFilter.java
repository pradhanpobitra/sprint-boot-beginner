package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
        System.out.println("Collaborative filter constructor called..");
    }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {};
    }
}
