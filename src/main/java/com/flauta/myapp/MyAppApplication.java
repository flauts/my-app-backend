package com.flauta.myapp;

import  org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication {

    private static final Logger log = LoggerFactory.getLogger(MyAppApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
        log.info("51/49");
    }

}
