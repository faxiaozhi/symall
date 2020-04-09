package com.yima.symall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.Query;
import com.yima.core.bean.QueryCondition;

import com.yima.symall.ums.dao.MemberLevelDao;
import com.yima.symall.ums.entity.MemberLevelEntity;
import com.yima.symall.ums.service.MemberLevelService;


@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevelEntity> implements MemberLevelService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberLevelEntity> page = this.page(
                new Query<MemberLevelEntity>().getPage(params),
                new QueryWrapper<MemberLevelEntity>()
        );

        return new PageVo(page);
    }

}