package com.lzy.xier.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *               1.整合mybatis-Plus
 *               1>.导入依赖
 *               2》。配置数据源
 *
 *
 *
 */



//dao下文件有@mapper标识可以不配@MapperScan
@MapperScan("com.lzy.xier.product.dao")
@SpringBootApplication
public class XierProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(XierProductApplication.class, args);
    }

}
