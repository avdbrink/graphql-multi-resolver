package com.example.graphql.configuration;

import com.graphql.spring.boot.test.GraphQLTestTemplate;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public GraphQLTestTemplate graphQLTestUtils() {
        return new GraphQLTestTemplate();
    }
}
