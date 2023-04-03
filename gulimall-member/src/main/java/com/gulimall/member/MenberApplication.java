package com.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.gulimall")
@EnableFeignClients
public class MenberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenberApplication.class, args);
    }
}
