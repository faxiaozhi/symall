package com.yima.symall.pms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yima.symall.pms.entity.CategoryEntity;
import com.yima.symall.pms.vo.CategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品三级分类
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:02:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

    List<CategoryVO> querySubCategories(Long pid);
}
