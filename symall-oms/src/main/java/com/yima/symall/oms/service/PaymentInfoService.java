package com.yima.symall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.oms.entity.PaymentInfoEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:12:21
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

