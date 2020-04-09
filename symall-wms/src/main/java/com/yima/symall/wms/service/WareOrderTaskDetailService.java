package com.yima.symall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.wms.entity.WareOrderTaskDetailEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 17:59:50
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageVo queryPage(QueryCondition params);
}

