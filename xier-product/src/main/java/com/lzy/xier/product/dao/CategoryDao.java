package com.lzy.xier.product.dao;

import com.lzy.xier.common.dao.BaseDao;
import com.lzy.xier.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Mapper
public interface CategoryDao extends BaseDao<CategoryEntity> {
	
}