package com.lzy.xier.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 商品评价回复关系
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Data
@ApiModel(value = "商品评价回复关系")
public class CommentReplayDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Long id;

	@ApiModelProperty(value = "评论id")
	private Long commentId;

	@ApiModelProperty(value = "回复id")
	private Long replyId;


}