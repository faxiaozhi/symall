package com.yima.symall.pms.feign;

import com.yima.symall.sms.api.SymallSmsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("sms-service")
public interface SymallSmsClient extends SymallSmsApi {

}
