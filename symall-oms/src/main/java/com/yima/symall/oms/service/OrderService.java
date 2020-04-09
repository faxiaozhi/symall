package com.yima.symall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.oms.entity.OrderEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 订单
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:12:21
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

