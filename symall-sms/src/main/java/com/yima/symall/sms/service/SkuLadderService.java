package com.yima.symall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.sms.entity.SkuLadderEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 商品阶梯价格
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:14:30
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageVo queryPage(QueryCondition params);
}

