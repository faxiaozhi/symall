package com.yima.symall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.pms.entity.SpuInfoEntity;
import com.yima.symall.pms.vo.SpuInfoVO;

import java.io.FileNotFoundException;


/**
 * spu信息
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2019-12-02 11:23:36
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo querySpuPage(QueryCondition condition, Long cid);


    void bigSave(SpuInfoVO spuInfoVO) throws FileNotFoundException;


}

