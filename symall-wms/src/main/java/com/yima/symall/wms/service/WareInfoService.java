package com.yima.symall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.wms.entity.WareInfoEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 仓库信息
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 17:59:50
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

