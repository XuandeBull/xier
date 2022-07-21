package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lzy.xier.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品评价回复关系
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("pms_comment_replay")
public class CommentReplayEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
	private Long commentId;
    /**
     * 回复id
     */
	private Long replyId;
}