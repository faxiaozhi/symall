package com.yima.symall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.oms.entity.OrderReturnReasonEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 退货原因
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:12:21
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageVo queryPage(QueryCondition params);
}

