package com.yima.symall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.Query;
import com.yima.core.bean.QueryCondition;

import com.yima.symall.ums.dao.MemberCollectSubjectDao;
import com.yima.symall.ums.entity.MemberCollectSubjectEntity;
import com.yima.symall.ums.service.MemberCollectSubjectService;


@Service("memberCollectSubjectService")
public class MemberCollectSubjectServiceImpl extends ServiceImpl<MemberCollectSubjectDao, MemberCollectSubjectEntity> implements MemberCollectSubjectService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberCollectSubjectEntity> page = this.page(
                new Query<MemberCollectSubjectEntity>().getPage(params),
                new QueryWrapper<MemberCollectSubjectEntity>()
        );

        return new PageVo(page);
    }

}