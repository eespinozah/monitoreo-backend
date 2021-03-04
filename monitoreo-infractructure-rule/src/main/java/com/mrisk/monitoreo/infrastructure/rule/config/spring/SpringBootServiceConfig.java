package com.mrisk.monitoreo.infrastructure.rule.config.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mrisk.monitoreo.application.repository.PointRepository;
import com.mrisk.monitoreo.application.repository.StorageRepository;
import com.mrisk.monitoreo.application.service.PointService;
import com.mrisk.monitoreo.application.service.StorageService;

@Configuration
public class SpringBootServiceConfig {


  @Bean
  public PointService pointService(PointRepository pointRepository) {
    return new PointService(pointRepository);
  }
 
  @Bean
  public StorageService storageService(StorageRepository storageRepository) {
    return new StorageService(storageRepository);
  }
  
}