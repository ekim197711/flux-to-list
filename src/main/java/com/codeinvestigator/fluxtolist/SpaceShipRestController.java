package com.codeinvestigator.fluxtolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class SpaceShipRestController {

    @GetMapping("/api/spaceship/names")
    public Flux<String> spaceshipNames(){
        return Flux.just("Round", "Blue", "Cube", "Pyramid", "Huge", "Red", "Pointy")
                .delayElements(Duration.ofMillis(500));
    }
}
