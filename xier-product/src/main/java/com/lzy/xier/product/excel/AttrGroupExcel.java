package com.lzy.xier.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * 属性分组
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@Data
public class AttrGroupExcel {
    @Excel(name = "分组id")
    private Long attrGroupId;
    @Excel(name = "组名")
    private String attrGroupName;
    @Excel(name = "排序")
    private Integer sort;
    @Excel(name = "描述")
    private String descript;
    @Excel(name = "组图标")
    private String icon;
    @Excel(name = "所属分类id")
    private Long catelogId;

}