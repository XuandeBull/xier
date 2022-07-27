package com.lzy.xier.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzy.xier.common.service.impl.CrudServiceImpl;
import com.lzy.xier.coupon.dao.CouponSpuCategoryRelationDao;
import com.lzy.xier.coupon.dto.CouponSpuCategoryRelationDTO;
import com.lzy.xier.coupon.entity.CouponSpuCategoryRelationEntity;
import com.lzy.xier.coupon.service.CouponSpuCategoryRelationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Service
public class CouponSpuCategoryRelationServiceImpl extends CrudServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity, CouponSpuCategoryRelationDTO> implements CouponSpuCategoryRelationService {

    @Override
    public QueryWrapper<CouponSpuCategoryRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CouponSpuCategoryRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}