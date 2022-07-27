package com.lzy.xier.order.dao;

import com.lzy.xier.common.dao.BaseDao;
import com.lzy.xier.order.entity.OrderItemEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Mapper
public interface OrderItemDao extends BaseDao<OrderItemEntity> {
	
}