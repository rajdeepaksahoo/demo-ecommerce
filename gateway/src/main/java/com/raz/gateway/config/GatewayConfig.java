package com.raz.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("products_route", r -> r
                        .path("/products/**")
                        .uri("lb://products-service"))
                .route("order_route",r->r
                        .path("/order/**")
                        .uri("lb://order-service")
                )
                .route("eureka_route",r->r
                        .path("/eureka/**")
                        .uri("lb://http://localhost:8761")
                )
                .build();
    }
}
