package com.yima.symall.sms.api;

import com.yima.core.bean.Resp;
import com.yima.symall.sms.vo.SaleVO;
import com.yima.symall.sms.vo.SkuSaleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SymallSmsApi {

    @PostMapping("sms/skubounds/sku/sale/save")
    public Resp<Object> saveSale(@RequestBody SkuSaleVO skuSaleVO);

    @GetMapping("sms/skubounds/{skuId}")
    public Resp<List<SaleVO>> querySalesBySkuId(@PathVariable("skuId") Long skuId);
}
