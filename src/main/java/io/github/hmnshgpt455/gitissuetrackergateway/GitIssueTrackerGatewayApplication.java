package io.github.hmnshgpt455.gitissuetrackergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class GitIssueTrackerGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitIssueTrackerGatewayApplication.class, args);
    }

}
