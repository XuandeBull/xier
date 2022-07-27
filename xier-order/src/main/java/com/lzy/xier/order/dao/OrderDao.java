package com.lzy.xier.order.dao;

import com.lzy.xier.common.dao.BaseDao;
import com.lzy.xier.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Mapper
public interface OrderDao extends BaseDao<OrderEntity> {
	
}