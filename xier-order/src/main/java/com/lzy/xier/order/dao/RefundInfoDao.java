package com.lzy.xier.order.dao;

import com.lzy.xier.common.dao.BaseDao;
import com.lzy.xier.order.entity.RefundInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Mapper
public interface RefundInfoDao extends BaseDao<RefundInfoEntity> {
	
}