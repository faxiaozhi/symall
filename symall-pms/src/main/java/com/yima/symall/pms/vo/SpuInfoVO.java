package com.yima.symall.pms.vo;


import com.yima.symall.pms.entity.SpuInfoEntity;
import lombok.Data;

import java.util.List;

@Data
public class SpuInfoVO extends SpuInfoEntity {

    private List<String> spuImages;

    private List<BaseAttrVO> baseAttrs;

    private List<SkuInfoVO> skus;
}
