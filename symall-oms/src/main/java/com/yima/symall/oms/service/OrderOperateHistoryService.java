package com.yima.symall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.oms.entity.OrderOperateHistoryEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 订单操作历史记录
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:12:21
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

