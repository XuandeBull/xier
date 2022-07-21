package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lzy.xier.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * sku图片
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("pms_sku_images")
public class SkuImagesEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * sku_id
     */
	private Long skuId;
    /**
     * 图片地址
     */
	private String imgUrl;
    /**
     * 排序
     */
	private Integer imgSort;
    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
	private Integer defaultImg;
}