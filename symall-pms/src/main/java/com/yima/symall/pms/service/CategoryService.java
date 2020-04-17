package com.yima.symall.pms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.pms.entity.CategoryEntity;
import com.yima.symall.pms.vo.CategoryVO;

import java.util.List;


/**
 * 商品三级分类
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2019-12-02 11:23:36
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);

    List<CategoryVO> querySubCategories(Long pid);
}

