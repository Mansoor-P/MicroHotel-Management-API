package com.mansoor.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.mansoor.rating")
public class RatingServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(RatingServiceApplication.class, args);
    }

}
