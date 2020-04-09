package com.yima.symall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.pms.entity.BrandEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 品牌
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:02:31
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

