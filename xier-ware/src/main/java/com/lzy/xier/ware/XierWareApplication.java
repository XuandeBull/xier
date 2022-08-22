package com.lzy.xier.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XierWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(XierWareApplication.class, args);
    }

}
