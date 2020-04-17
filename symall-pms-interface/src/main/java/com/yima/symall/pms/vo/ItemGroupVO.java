package com.yima.symall.pms.vo;

import com.yima.symall.pms.entity.ProductAttrValueEntity;
import lombok.Data;

import java.util.List;

@Data
public class ItemGroupVO {

    private String name;

    private List<ProductAttrValueEntity> baseAttrs;
}
