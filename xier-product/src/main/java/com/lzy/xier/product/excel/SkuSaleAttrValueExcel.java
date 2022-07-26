package com.lzy.xier.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * sku销售属性&值
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
public class SkuSaleAttrValueExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "sku_id")
    private Long skuId;
    @Excel(name = "attr_id")
    private Long attrId;
    @Excel(name = "销售属性名")
    private String attrName;
    @Excel(name = "销售属性值")
    private String attrValue;
    @Excel(name = "顺序")
    private Integer attrSort;

}