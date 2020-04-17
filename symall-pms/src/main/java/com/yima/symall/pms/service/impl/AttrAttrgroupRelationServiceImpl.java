package com.yima.symall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.Query;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.pms.dao.AttrAttrgroupRelationDao;
import com.yima.symall.pms.entity.AttrAttrgroupRelationEntity;
import com.yima.symall.pms.service.AttrAttrgroupRelationService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements AttrAttrgroupRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrAttrgroupRelationEntity> page = this.page(
                new Query<AttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<AttrAttrgroupRelationEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public void deleteRelation(List<AttrAttrgroupRelationEntity> relationEntityList) {

        relationEntityList.forEach(relationEntity -> {
            this.remove(new QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", relationEntity.getAttrId()).eq("attr_group_id", relationEntity.getAttrGroupId()));
        });
    }

}