package com.yima.symall.search.feign;

import com.yima.symall.pms.api.SymallPmsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("pms-service")
public interface SymallPmsClient extends SymallPmsApi {
}
