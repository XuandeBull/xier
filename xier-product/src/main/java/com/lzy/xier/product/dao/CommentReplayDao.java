package com.lzy.xier.product.dao;

import com.lzy.xier.common.dao.BaseDao;
import com.lzy.xier.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@Mapper
public interface CommentReplayDao extends BaseDao<CommentReplayEntity> {
	
}