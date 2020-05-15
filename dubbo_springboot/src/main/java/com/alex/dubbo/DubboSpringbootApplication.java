package com.alex.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:springboot-dubbo-provider.xml")
@SpringBootApplication
public class DubboSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootApplication.class, args);
    }

}
