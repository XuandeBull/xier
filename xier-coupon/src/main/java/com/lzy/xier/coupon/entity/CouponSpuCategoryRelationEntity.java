package com.lzy.xier.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 优惠券分类关联
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 优惠券id
     */
	private Long couponId;
    /**
     * 产品分类id
     */
	private Long categoryId;
    /**
     * 产品分类名称
     */
	private String categoryName;
}