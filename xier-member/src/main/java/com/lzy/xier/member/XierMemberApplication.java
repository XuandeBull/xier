package com.lzy.xier.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients(basePackages = "com.lzy.xier.member.feign")
@EnableDiscoveryClient
@SpringBootApplication

public class XierMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XierMemberApplication.class, args);
    }

}
