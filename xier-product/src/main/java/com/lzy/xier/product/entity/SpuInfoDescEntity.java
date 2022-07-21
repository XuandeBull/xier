package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lzy.xier.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * spu信息介绍
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
	private Long spuId;
    /**
     * 商品介绍
     */
	private String decript;
}