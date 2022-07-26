package com.lzy.xier.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * spu信息介绍
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
public class SpuInfoDescExcel {
    @Excel(name = "商品id")
    private Long spuId;
    @Excel(name = "商品介绍")
    private String decript;

}