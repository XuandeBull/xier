package com.lzy.xier.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzy.xier.common.service.impl.CrudServiceImpl;
import com.lzy.xier.product.dao.SkuImagesDao;
import com.lzy.xier.product.dto.SkuImagesDTO;
import com.lzy.xier.product.entity.SkuImagesEntity;
import com.lzy.xier.product.service.SkuImagesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku图片
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@Service
public class SkuImagesServiceImpl extends CrudServiceImpl<SkuImagesDao, SkuImagesEntity, SkuImagesDTO> implements SkuImagesService {

    @Override
    public QueryWrapper<SkuImagesEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuImagesEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}