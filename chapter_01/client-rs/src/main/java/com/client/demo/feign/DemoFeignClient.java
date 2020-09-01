package com.client.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dchowdhu on 01/09/20.
 */
@FeignClient("server-rs-v1")
public interface DemoFeignClient {

  @RequestMapping(method = RequestMethod.GET, value = "/employee")
  String getEmployee();

}
