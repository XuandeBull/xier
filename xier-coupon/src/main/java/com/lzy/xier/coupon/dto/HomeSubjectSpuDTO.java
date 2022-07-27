package com.lzy.xier.coupon.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 专题商品
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Data
@ApiModel(value = "专题商品")
public class HomeSubjectSpuDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Long id;

	@ApiModelProperty(value = "专题名字")
	private String name;

	@ApiModelProperty(value = "专题id")
	private Long subjectId;

	@ApiModelProperty(value = "spu_id")
	private Long spuId;

	@ApiModelProperty(value = "排序")
	private Integer sort;


}