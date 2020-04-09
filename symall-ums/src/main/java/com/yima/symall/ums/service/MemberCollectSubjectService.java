package com.yima.symall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.ums.entity.MemberCollectSubjectEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 会员收藏的专题活动
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:16:49
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

