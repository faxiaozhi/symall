package com.yima.symall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.ums.entity.MemberStatisticsInfoEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 会员统计信息
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:16:49
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

