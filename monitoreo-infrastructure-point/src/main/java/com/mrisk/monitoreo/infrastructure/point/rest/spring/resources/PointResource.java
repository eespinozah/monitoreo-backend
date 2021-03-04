package com.mrisk.monitoreo.infrastructure.point.rest.spring.resources;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mrisk.monitoreo.application.service.PointService;
import com.mrisk.monitoreo.infrastructure.point.rest.spring.dto.DocumentDto;
import com.mrisk.monitoreo.infrastructure.point.rest.spring.dto.PointDto;
import com.mrisk.monitoreo.infrastructure.point.rest.spring.mapper.PointMapper;
 
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class PointResource {

  private final PointService pointService;
  private final PointMapper pointMapper;
  
//  @GetMapping("/points")
//  public ResponseEntity<PointDto> getPointAll() {
//	  System.out.println(pointService.getPointAll().size());
////    return new ResponseEntity<>(pointMapper.toDto(pointService.getPointAll()), HttpStatus.OK);
//	  return new ResponseEntity<>( HttpStatus.OK);
//  } 
  @GetMapping("/points/{id}")
  public ResponseEntity<PointDto> getPointById(@PathVariable Integer id) {
	  
	  System.out.println("Obtener los puntos de medicion con id"+ id);
	  
	  PointDto pointDto = pointMapper.toDto(pointService.singleSelectPoint(id));
	  addPointLinks(pointDto);
	  
    return new ResponseEntity<>((pointDto), HttpStatus.OK);
  }
  @PostMapping("/points")
  public ResponseEntity<PointDto> savePoint(@RequestBody PointDto pointDto) {
    return new ResponseEntity<>(pointMapper.toDto(pointService.savePoint(pointMapper.toDomain(pointDto))),HttpStatus.CREATED);

  }
  private void addPointLinks(PointDto pointDto) {
      addSelfLink(pointDto);
      addStorageLink(pointDto);
  }
  private void addSelfLink(PointDto pointDto) {
	  pointDto.add(linkTo(methodOn(PointResource.class).getPointById(pointDto.getPoin_id())).withSelfRel());
  }
  private void addStorageLink(PointDto pointDto) {
//	  pointDto.add(linkTo(methodOn(StorageResource.class).saveStorage(pointDto.getId(), new StorageDto())).withRel("add-storage"));
	  pointDto.add(linkTo(methodOn(DocumentResource.class).saveDocument(pointDto.getPoin_id(), new DocumentDto())).withRel("add-document"));
	  
  }
}