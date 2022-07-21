package com.lzy.xier.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * 品牌分类关联
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@Data
public class CategoryBrandRelationExcel {
    @Excel(name = "")
    private Long id;
    @Excel(name = "品牌id")
    private Long brandId;
    @Excel(name = "分类id")
    private Long catelogId;
    @Excel(name = "")
    private String brandName;
    @Excel(name = "")
    private String catelogName;

}