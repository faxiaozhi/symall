package com.yima.symall.oms.dao;

import com.yima.symall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:12:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
