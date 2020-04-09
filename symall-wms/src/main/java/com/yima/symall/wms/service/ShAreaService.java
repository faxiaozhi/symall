package com.yima.symall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.wms.entity.ShAreaEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 全国省市区信息
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 17:59:50
 */
public interface ShAreaService extends IService<ShAreaEntity> {

    PageVo queryPage(QueryCondition params);
}

