package com.yima.symall.oms.api;

import com.yima.core.bean.Resp;
import com.yima.symall.oms.entity.OrderEntity;
import com.yima.symall.oms.vo.OrderSubmitVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SymallOmsApi {

    @PostMapping("oms/order")
    public Resp<OrderEntity> saveOrder(@RequestBody OrderSubmitVO submitVO);
}
