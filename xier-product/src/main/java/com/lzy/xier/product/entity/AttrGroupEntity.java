package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lzy.xier.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 属性分组
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("pms_attr_group")
public class AttrGroupEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * 分组id
     */
	private Long attrGroupId;
    /**
     * 组名
     */
	private String attrGroupName;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 描述
     */
	private String descript;
    /**
     * 组图标
     */
	private String icon;
    /**
     * 所属分类id
     */
	private Long catelogId;
}