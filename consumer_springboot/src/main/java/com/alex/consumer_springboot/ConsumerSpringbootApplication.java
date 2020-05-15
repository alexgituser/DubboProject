package com.alex.consumer_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:boot-consumer.xml")
public class ConsumerSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringbootApplication.class, args);
    }

}
