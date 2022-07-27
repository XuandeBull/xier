package com.lzy.xier.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzy.xier.common.service.impl.CrudServiceImpl;
import com.lzy.xier.order.dao.PaymentInfoDao;
import com.lzy.xier.order.dto.PaymentInfoDTO;
import com.lzy.xier.order.entity.PaymentInfoEntity;
import com.lzy.xier.order.service.PaymentInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Service
public class PaymentInfoServiceImpl extends CrudServiceImpl<PaymentInfoDao, PaymentInfoEntity, PaymentInfoDTO> implements PaymentInfoService {

    @Override
    public QueryWrapper<PaymentInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PaymentInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}