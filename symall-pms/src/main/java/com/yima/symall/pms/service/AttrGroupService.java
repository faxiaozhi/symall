package com.yima.symall.pms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.pms.entity.AttrGroupEntity;
import com.yima.symall.pms.vo.GroupVO;
import com.yima.symall.pms.vo.ItemGroupVO;

import java.util.List;


/**
 * 属性分组
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2019-12-02 11:23:36
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo queryGroupByPage(QueryCondition condition, Long catId);

    GroupVO queryGroupWithAttrsByGid(Long gid);

    List<GroupVO> queryGroupWithAttrsByCid(Long cid);

    List<ItemGroupVO> queryItemGroupVOByCidAndSpuId(Long cid, Long spuId);
}

