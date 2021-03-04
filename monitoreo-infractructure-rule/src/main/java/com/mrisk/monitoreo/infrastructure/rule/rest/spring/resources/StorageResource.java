package com.mrisk.monitoreo.infrastructure.rule.rest.spring.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mrisk.monitoreo.application.service.StorageService;
import com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto.StorageDto;
import com.mrisk.monitoreo.infrastructure.rule.rest.spring.mapper.StorageMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class StorageResource {
 
  private final StorageService storageService;

  private final StorageMapper storageMapper;
  
  
  @PostMapping("/points/{pointId}/storage")
  public ResponseEntity<StorageDto> saveStorage(@PathVariable Long pointId, @RequestBody StorageDto storageDto) {
	  storageDto.setPointId(pointId);
	  return new ResponseEntity<>(storageMapper.toDto(storageService.saveStorage(storageMapper.toDomain(storageDto))),HttpStatus.CREATED);
//	  return new ResponseEntity<>( HttpStatus.OK);
  }

}
