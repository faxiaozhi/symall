package com.yima.symall.pms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.pms.entity.SpuInfoDescEntity;
import com.yima.symall.pms.vo.SpuInfoVO;


/**
 * spu信息介绍
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2019-12-02 11:23:36
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageVo queryPage(QueryCondition params);

    void saveSpuInfoDesc(SpuInfoVO spuInfoVO, Long spuId);
}

