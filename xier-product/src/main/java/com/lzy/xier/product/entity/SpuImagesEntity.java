package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lzy.xier.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * spu图片
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("pms_spu_images")
public class SpuImagesEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * spu_id
     */
	private Long spuId;
    /**
     * 图片名
     */
	private String imgName;
    /**
     * 图片地址
     */
	private String imgUrl;
    /**
     * 顺序
     */
	private Integer imgSort;
    /**
     * 是否默认图
     */
	private Integer defaultImg;
}