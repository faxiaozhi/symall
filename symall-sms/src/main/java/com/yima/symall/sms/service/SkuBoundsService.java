package com.yima.symall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;
import com.yima.symall.sms.entity.SkuBoundsEntity;
import com.yima.symall.sms.vo.SaleVO;
import com.yima.symall.sms.vo.SkuSaleVO;

import java.util.List;


/**
 * 商品sku积分设置
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 18:14:30
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageVo queryPage(QueryCondition params);

    void saveSale(SkuSaleVO skuSaleVO);

    List<SaleVO> querySalesBySkuId(Long skuId);
}

