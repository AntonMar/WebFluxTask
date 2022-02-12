package com.example.firstcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/first")
public class FirstController {

    WebClient client = WebClient.create("http://localhost:5556/second");

    @GetMapping()
    private Mono<String> getValue() {
        Mono<String> returnValue = client.get().retrieve().bodyToMono(String.class);
        System.out.println("Hello!!!");
        return returnValue;
    }
}
