package com.yima.symall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.sms.entity.SpuBoundsEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 商品spu积分设置
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:14:30
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

