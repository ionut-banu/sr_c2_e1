package com.example.sr_c2_e1.services;

import com.example.sr_c2_e1.model.Product;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.stream.Stream;

import reactor.core.publisher.Flux;

@Service
public class ProductService {

    public Flux<Product> getAll() {
        var p1 = new Product("Beer");
        var p2 = new Product("Chocolate");
        return Flux.fromStream(Stream.of(p1, p2))
                   .delayElements(Duration.ofSeconds(3));
    }

}
