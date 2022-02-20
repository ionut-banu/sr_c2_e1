package com.example.sr_c2_e1.config;

import com.example.sr_c2_e1.handlers.ProductHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.RequiredArgsConstructor;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class RoutesConfig {

    @Bean
    public RouterFunction<ServerResponse> router(ProductHandler productHandler) {
        return route().GET("/product", productHandler::getAll).build();
    }
}
