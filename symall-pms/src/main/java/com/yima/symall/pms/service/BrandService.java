package com.yima.symall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.pms.entity.BrandEntity;


/**
 * 品牌
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2019-12-02 11:23:36
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

