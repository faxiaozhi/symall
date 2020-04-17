package com.yima.symall.wms.api;

import com.yima.core.bean.Resp;
import com.yima.symall.wms.entity.WareSkuEntity;
import com.yima.symall.wms.vo.SkuLockVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SymallWmsApi {

    @GetMapping("wms/waresku/{skuId}")
    public Resp<List<WareSkuEntity>> queryWareSkusBySkuId(@PathVariable("skuId") Long skuId);

    @PostMapping("wms/waresku")
    public Resp<Object> checkAndLockStore(@RequestBody List<SkuLockVO> skuLockVOS);
}
