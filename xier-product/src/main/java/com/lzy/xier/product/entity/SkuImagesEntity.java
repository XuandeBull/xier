package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * sku图片
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity {

    /**
     * id
     */
	private Long id;
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