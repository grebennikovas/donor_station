package com.donor.station;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class StationApplication {

    public static void main(String[] args) {
        SpringApplication.run(StationApplication.class, args);
    }

}
