package com.lzy.xier.product;

import com.lzy.xier.product.entity.BrandEntity;
import com.lzy.xier.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class XierProductApplicationTests {

   @Autowired
   BrandService brandService;



    @Test
    void contextLoads() {

        BrandEntity brandEntity=new BrandEntity();

        brandEntity.setName("小米");
        brandService.insert(brandEntity);

        System.out.println("brandEntity1成功........");



    }

}
