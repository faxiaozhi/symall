package com.yima.symall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.Query;
import com.yima.core.bean.QueryCondition;

import com.yima.symall.sms.dao.SkuLadderDao;
import com.yima.symall.sms.entity.SkuLadderEntity;
import com.yima.symall.sms.service.SkuLadderService;


@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadderEntity> implements SkuLadderService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SkuLadderEntity> page = this.page(
                new Query<SkuLadderEntity>().getPage(params),
                new QueryWrapper<SkuLadderEntity>()
        );

        return new PageVo(page);
    }

}