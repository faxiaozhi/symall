package com.yima.symall.pms.dao;

import com.yima.symall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:02:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
