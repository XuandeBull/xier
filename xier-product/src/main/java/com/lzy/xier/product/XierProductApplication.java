package com.lzy.xier.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *               1.整合mybatis-Plus
 *               1>.导入依赖
 *               2》。配置数据源
 *
 * @MapperScan("com.lzy.xier.product.dao") 指向mapper文件
 *
 */


@EnableDiscoveryClient

@SpringBootApplication
public class XierProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(XierProductApplication.class, args);
    }

}
