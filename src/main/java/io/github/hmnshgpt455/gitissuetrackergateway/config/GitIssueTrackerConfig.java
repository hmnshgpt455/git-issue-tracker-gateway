package io.github.hmnshgpt455.gitissuetrackergateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GitIssueTrackerConfig {

    @Bean
    public RouteLocator issueTrackerRoutes(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(r -> r.path("/api/v1/user**", "/api/v1/user/**", "/api/v1/project**", "/api/v1/project/**",
                        "/api/v1/organization**", "/api/v1/organization/**")
                .uri("lb://user-service"))
                .build();
    }
}
