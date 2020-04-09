package com.yima.symall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.sms.entity.HomeAdvEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 首页轮播广告
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:14:30
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageVo queryPage(QueryCondition params);
}

