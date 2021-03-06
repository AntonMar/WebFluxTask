package com.example.secondcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/second")
public class SecondController {

    @GetMapping()
    private Mono<String> getValue() {
        return Mono.just("return-value-2");
    }
}
