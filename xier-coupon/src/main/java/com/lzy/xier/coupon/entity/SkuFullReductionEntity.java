package com.lzy.xier.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品满减信息
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity {

    /**
     * id
     */
	private Long id;
    /**
     * spu_id
     */
	private Long skuId;
    /**
     * 满多少
     */
	private BigDecimal fullPrice;
    /**
     * 减多少
     */
	private BigDecimal reducePrice;
    /**
     * 是否参与其他优惠
     */
	private Integer addOther;
}