package com.lzy.xier.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzy.xier.common.service.impl.CrudServiceImpl;
import com.lzy.xier.product.dao.CategoryBrandRelationDao;
import com.lzy.xier.product.dto.CategoryBrandRelationDTO;
import com.lzy.xier.product.entity.CategoryBrandRelationEntity;
import com.lzy.xier.product.service.CategoryBrandRelationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Service
public class CategoryBrandRelationServiceImpl extends CrudServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity, CategoryBrandRelationDTO> implements CategoryBrandRelationService {

    @Override
    public QueryWrapper<CategoryBrandRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CategoryBrandRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}