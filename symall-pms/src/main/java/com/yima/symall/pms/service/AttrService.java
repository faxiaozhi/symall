package com.yima.symall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.pms.entity.AttrEntity;
import com.yima.symall.pms.vo.AttrVO;


/**
 * 商品属性
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2019-12-02 11:23:37
 */
public interface AttrService extends IService<AttrEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo queryAttrsByCid(QueryCondition condition, Long cid, Integer type);

    void saveAttr(AttrVO attrVO);

}

