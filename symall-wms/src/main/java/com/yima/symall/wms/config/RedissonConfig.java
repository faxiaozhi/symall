package com.yima.symall.wms.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    /*@Bean
    public RedissonClient redissonClient(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        return Redisson.create(config);
    }*/
}
