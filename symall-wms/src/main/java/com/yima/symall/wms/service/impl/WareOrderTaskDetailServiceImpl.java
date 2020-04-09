package com.yima.symall.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.Query;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.wms.dao.WareOrderTaskDetailDao;
import com.yima.symall.wms.entity.WareOrderTaskDetailEntity;
import com.yima.symall.wms.service.WareOrderTaskDetailService;
import org.springframework.stereotype.Service;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity> implements WareOrderTaskDetailService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<WareOrderTaskDetailEntity> page = this.page(
                new Query<WareOrderTaskDetailEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskDetailEntity>()
        );

        return new PageVo(page);
    }

}