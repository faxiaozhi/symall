package com.yima.symall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.ums.entity.MemberLevelEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 会员等级
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:16:49
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageVo queryPage(QueryCondition params);
}

