package com.lzy.xier.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 专题商品
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Data
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 专题名字
     */
	private String name;
    /**
     * 专题id
     */
	private Long subjectId;
    /**
     * spu_id
     */
	private Long spuId;
    /**
     * 排序
     */
	private Integer sort;
}