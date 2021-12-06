package com.example.prjmanufacturerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PrjManufacturerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrjManufacturerServiceApplication.class, args);
    }

}
