package com.lzy.xier.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 商品评价回复关系
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplayEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 评论id
     */
	private Long commentId;
    /**
     * 回复id
     */
	private Long replyId;
}