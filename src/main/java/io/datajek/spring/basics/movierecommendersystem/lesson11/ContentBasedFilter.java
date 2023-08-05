package io.datajek.spring.basics.movierecommendersystem.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ContentBasedFilter() {
        logger.info("Creating ContentBasedFilter bean...");
    }

    @PostConstruct
    private void postConstruct() {
        logger.info("Inside postConstruct of ContentBasedFilter...");
    }

    @Override
    public String[] getRecommendations(String movie) {
        // get recommendations based on content filtration
        return new String[] {"Spiderman" , "Superman", "Batman"};
    }

    @PreDestroy
    private void preDestroy() {
        logger.info("Destroying content based filter bean..");
    }
}
