package com.yima.symall.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan("com.yima.symall.oms.dao")
public class SymallOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SymallOmsApplication.class, args);
    }

}
