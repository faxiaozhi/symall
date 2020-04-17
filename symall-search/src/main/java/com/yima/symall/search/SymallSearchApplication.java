package com.yima.symall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SymallSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SymallSearchApplication.class, args);
    }

}
