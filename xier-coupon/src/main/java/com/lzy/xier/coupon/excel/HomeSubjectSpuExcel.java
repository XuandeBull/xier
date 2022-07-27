package com.lzy.xier.coupon.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * 专题商品
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Data
public class HomeSubjectSpuExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "专题名字")
    private String name;
    @Excel(name = "专题id")
    private Long subjectId;
    @Excel(name = "spu_id")
    private Long spuId;
    @Excel(name = "排序")
    private Integer sort;

}