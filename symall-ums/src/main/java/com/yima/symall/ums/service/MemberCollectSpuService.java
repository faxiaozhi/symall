package com.yima.symall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.ums.entity.MemberCollectSpuEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 会员收藏的商品
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:16:49
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

