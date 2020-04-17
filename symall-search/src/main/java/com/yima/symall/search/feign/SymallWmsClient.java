package com.yima.symall.search.feign;

import com.yima.symall.wms.api.SymallWmsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("wms-service")
public interface SymallWmsClient extends SymallWmsApi {
}
