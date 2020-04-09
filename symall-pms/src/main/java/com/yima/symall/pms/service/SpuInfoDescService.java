package com.yima.symall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.pms.entity.SpuInfoDescEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * spu信息介绍
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:02:31
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageVo queryPage(QueryCondition params);
}

