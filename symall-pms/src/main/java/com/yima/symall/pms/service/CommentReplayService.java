package com.yima.symall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.pms.entity.CommentReplayEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 商品评价回复关系
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:02:30
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVo queryPage(QueryCondition params);
}

