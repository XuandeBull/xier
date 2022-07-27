package com.lzy.xier.order.dao;

import com.lzy.xier.common.dao.BaseDao;
import com.lzy.xier.order.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Mapper
public interface OrderSettingDao extends BaseDao<OrderSettingEntity> {
	
}