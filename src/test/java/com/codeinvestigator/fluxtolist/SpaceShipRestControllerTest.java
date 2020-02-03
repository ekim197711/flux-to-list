package com.codeinvestigator.fluxtolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SpaceShipRestControllerTest {
    @Autowired
    SpaceShipRestController spaceShipRestController;

    @Test
    public void spaceshipNames() {
        Flux<String> stringFlux = spaceShipRestController.spaceshipNames();
        Mono<List<String>> mono = stringFlux.collectList();
        List<String> list = mono.block();
        for(String str : list){
            System.out.println("From mono list: " + str);
        }
    }
}