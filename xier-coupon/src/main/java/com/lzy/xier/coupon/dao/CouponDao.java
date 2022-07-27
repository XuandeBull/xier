package com.lzy.xier.coupon.dao;

import com.lzy.xier.common.dao.BaseDao;
import com.lzy.xier.coupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Mapper
public interface CouponDao extends BaseDao<CouponEntity> {
	
}