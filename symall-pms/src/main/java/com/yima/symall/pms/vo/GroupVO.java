package com.yima.symall.pms.vo;

import com.yima.symall.pms.entity.AttrAttrgroupRelationEntity;
import com.yima.symall.pms.entity.AttrEntity;
import com.yima.symall.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

@Data
public class GroupVO extends AttrGroupEntity {

    private List<AttrEntity> attrEntities;

    private List<AttrAttrgroupRelationEntity> relations;
}
