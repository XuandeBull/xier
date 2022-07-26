package com.lzy.xier.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzy.xier.common.service.impl.CrudServiceImpl;
import com.lzy.xier.product.dao.CommentReplayDao;
import com.lzy.xier.product.dto.CommentReplayDTO;
import com.lzy.xier.product.entity.CommentReplayEntity;
import com.lzy.xier.product.service.CommentReplayService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-26
 */
@Service
public class CommentReplayServiceImpl extends CrudServiceImpl<CommentReplayDao, CommentReplayEntity, CommentReplayDTO> implements CommentReplayService {

    @Override
    public QueryWrapper<CommentReplayEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CommentReplayEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}