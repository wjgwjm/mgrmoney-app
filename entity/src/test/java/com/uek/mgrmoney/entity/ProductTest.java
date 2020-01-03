package com.uek.mgrmoney.entity;

import com.uek.mgrmoney.enumeration.ProductStatus;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 实体类测试
 */
public class ProductTest {
    //日志
    private static Logger logger = Logger.getLogger(ProductTest.class);
    @Test
    public void createProduct(){
        Product p = new Product();
        p.setId("T001");
        p.setName("月光贷");
        p.setStartAmount(BigDecimal.valueOf(1000));
        p.setStatus(ProductStatus.SALING);
        p.setCreateAt(new Date());
        p.setCreateUser("lisi");
        logger.info(p);
    }
}
