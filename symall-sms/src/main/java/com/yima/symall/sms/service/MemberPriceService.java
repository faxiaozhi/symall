package com.yima.symall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.sms.entity.MemberPriceEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 商品会员价格
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:14:31
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageVo queryPage(QueryCondition params);
}

