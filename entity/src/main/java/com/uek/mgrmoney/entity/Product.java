package com.uek.mgrmoney.entity;

import com.uek.mgrmoney.enumeration.ProductStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 理财产品实体类
 *1.lombokperiod 锁定期 Integer 不用int
 * 2.金额 为什么要使用BigDecimal
 * 浮点类型的数据在底层的存储伪随机数
 * 伪数：就是不准确。但是我们需要完全准确
 * java为了解决这个问题，封装了一个工具类BigDecimal，用于准确进行数字计算
 *
 */
@Data
@NoArgsConstructor
public class Product implements Serializable {
    //产品编号
    private String id;
    //产品名称
    private String name;
    //起投金额
    private BigDecimal startAmount;
    //投资步长
    private BigDecimal stepAmount;
    //锁定期
    private Integer lockupPeriod;
    //收益率
    private BigDecimal earningRate;
    //状态
    private String status;
    //备注
    private String remark;
    //产品创建时间
    private Date createAt;
    //创建者
    private String createUser;
    //更新时间
    private String UpdateAt;
    //更新者
    private String updateUser;
    /**
     * 为了产品状态的安全考虑，我们使用ProductStatus枚举类型
     * 所以我们重写他的设置方法
     */
    public void setStatus(ProductStatus ps){
        this.status = ps.name();
    }
}
