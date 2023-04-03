package com.gulimall.product;

import com.gulimall.product.entity.BrandEntity;
import com.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BrandTest {

    @Autowired
    BrandService brandService;

    @Test
    public void brand() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("ssssss");
        brandService.save(brandEntity);
    }
}
