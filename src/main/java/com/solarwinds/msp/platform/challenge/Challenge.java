package com.solarwinds.msp.platform.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Challenge {

    private static final int HTTP_PORT = 80;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Challenge.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", HTTP_PORT));
        app.run(args);

        System.out.printf("Started server on port %s", HTTP_PORT);
    }
}
