package com.lzy.xier.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * spu属性值
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
public class ProductAttrValueExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "商品id")
    private Long spuId;
    @Excel(name = "属性id")
    private Long attrId;
    @Excel(name = "属性名")
    private String attrName;
    @Excel(name = "属性值")
    private String attrValue;
    @Excel(name = "顺序")
    private Integer attrSort;
    @Excel(name = "快速展示【是否展示在介绍上；0-否 1-是】")
    private Integer quickShow;

}