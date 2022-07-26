package com.lzy.xier.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzy.xier.common.service.impl.CrudServiceImpl;
import com.lzy.xier.product.dao.SpuInfoDao;
import com.lzy.xier.product.dto.SpuInfoDTO;
import com.lzy.xier.product.entity.SpuInfoEntity;
import com.lzy.xier.product.service.SpuInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu信息
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Service
public class SpuInfoServiceImpl extends CrudServiceImpl<SpuInfoDao, SpuInfoEntity, SpuInfoDTO> implements SpuInfoService {

    @Override
    public QueryWrapper<SpuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}