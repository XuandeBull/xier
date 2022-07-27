package com.lzy.xier.coupon.dao;

import com.lzy.xier.common.dao.BaseDao;
import com.lzy.xier.coupon.entity.MemberPriceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Mapper
public interface MemberPriceDao extends BaseDao<MemberPriceEntity> {
	
}