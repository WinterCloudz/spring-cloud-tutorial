package com.client.demo.resource;

import com.client.demo.hystrix.DemoHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dchowdhu on 01/09/20.
 */
@RestController
public class EmployeeResource {

  @Autowired
  DemoHystrixService demoHystrixService;

  @GetMapping(value = "/employee",produces = MediaType.TEXT_PLAIN_VALUE)
  public String getEmployee()
  {
    return  demoHystrixService.getEmployee();
  }

}
