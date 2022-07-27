package com.lzy.xier.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 优惠券与产品关联
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Data
@TableName("sms_coupon_spu_relation")
public class CouponSpuRelationEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 优惠券id
     */
	private Long couponId;
    /**
     * spu_id
     */
	private Long spuId;
    /**
     * spu_name
     */
	private String spuName;
}