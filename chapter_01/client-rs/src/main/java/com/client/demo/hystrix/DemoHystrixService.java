package com.client.demo.hystrix;

import com.client.demo.feign.DemoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dchowdhu on 01/09/20.
 */
@Service
public class DemoHystrixService {

  @Autowired
  DemoFeignClient demoFeignClient;

  public String getEmployee()
  {
    return demoFeignClient.getEmployee();
  }

}
