package com.yima.symall.pms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.pms.entity.ProductAttrValueEntity;

import java.util.List;


/**
 * spu属性值
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2019-12-02 11:23:36
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageVo queryPage(QueryCondition params);

    List<ProductAttrValueEntity> querySearchAttrValueBySpuId(Long spuId);
}

