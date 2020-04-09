package com.yima.symall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.symall.pms.entity.AttrGroupEntity;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;


/**
 * 属性分组
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:02:31
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

