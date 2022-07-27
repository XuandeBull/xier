package com.lzy.xier.coupon.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 优惠券分类关联
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Data
@ApiModel(value = "优惠券分类关联")
public class CouponSpuCategoryRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Long id;

	@ApiModelProperty(value = "优惠券id")
	private Long couponId;

	@ApiModelProperty(value = "产品分类id")
	private Long categoryId;

	@ApiModelProperty(value = "产品分类名称")
	private String categoryName;


}