package com.yima.symall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.wms.entity.WareSkuEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 商品库存
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 17:59:50
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageVo queryPage(QueryCondition params);
}

