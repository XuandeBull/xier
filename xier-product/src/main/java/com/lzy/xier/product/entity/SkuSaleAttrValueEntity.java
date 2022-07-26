package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * sku销售属性&值
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity {

    /**
     * id
     */
	private Long id;
    /**
     * sku_id
     */
	private Long skuId;
    /**
     * attr_id
     */
	private Long attrId;
    /**
     * 销售属性名
     */
	private String attrName;
    /**
     * 销售属性值
     */
	private String attrValue;
    /**
     * 顺序
     */
	private Integer attrSort;
}