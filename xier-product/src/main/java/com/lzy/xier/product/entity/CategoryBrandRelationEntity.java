package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 品牌分类关联
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
@TableName("pms_category_brand_relation")
public class CategoryBrandRelationEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 品牌id
     */
	private Long brandId;
    /**
     * 分类id
     */
	private Long catelogId;
    /**
     * 
     */
	private String brandName;
    /**
     * 
     */
	private String catelogName;
}