package com.mrisk.monitoreo.infrastructure.point.config.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.mrisk.monitoreo.infrastructure.point")
@EntityScan(basePackages = "com.mrisk.monitoreo.domain")
public class SpringBootService {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootService.class, args);
  }

}