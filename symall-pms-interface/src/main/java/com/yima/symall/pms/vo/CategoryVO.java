package com.yima.symall.pms.vo;


import com.yima.symall.pms.entity.CategoryEntity;
import lombok.Data;

import java.util.List;

@Data
public class CategoryVO extends CategoryEntity {

    private List<CategoryEntity> subs;
}
