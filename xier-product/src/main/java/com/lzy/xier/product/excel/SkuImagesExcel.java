package com.lzy.xier.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * sku图片
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
public class SkuImagesExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "sku_id")
    private Long skuId;
    @Excel(name = "图片地址")
    private String imgUrl;
    @Excel(name = "排序")
    private Integer imgSort;
    @Excel(name = "默认图[0 - 不是默认图，1 - 是默认图]")
    private Integer defaultImg;

}