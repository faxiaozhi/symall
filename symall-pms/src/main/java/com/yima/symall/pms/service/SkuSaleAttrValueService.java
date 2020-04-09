package com.yima.symall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.pms.entity.SkuSaleAttrValueEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * sku销售属性&值
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:02:31
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

