package com.server.demo.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dchowdhu on 01/09/20.
 */
@RestController
public class EmployeeResource {

  @GetMapping(value = "/employee", produces = MediaType.TEXT_PLAIN_VALUE)
  public String getEmployee() {
    return "Hi ! I am employee..";
  }
}
