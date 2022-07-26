package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * spu信息介绍
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity {

    /**
     * 商品id
     */
	private Long spuId;
    /**
     * 商品介绍
     */
	private String decript;
}