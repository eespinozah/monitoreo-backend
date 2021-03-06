package com.mrisk.monitoreo.infrastructure.rule.rest.spring.resources;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mrisk.monitoreo.application.rule.service.ParameterService;
import com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto.ParameterDto;
import com.mrisk.monitoreo.infrastructure.rule.rest.spring.mapper.ParameterMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ParameterResource {

  private final ParameterService parameterService;
  private final ParameterMapper parameterMapper;
 
  @GetMapping("/parameters/{id}")
  public ResponseEntity<?> singleSelectRule(@PathVariable Integer id) {
	  
	  ParameterDto parameterDto = parameterMapper.toDto(parameterService.singleSelectParameter(id));
	  
	  EntityModel<ParameterDto> resource = EntityModel.of(parameterDto); 
	  
	  addSelfLink(resource);
	  
    return new ResponseEntity<>((resource), HttpStatus.OK);
  }
  @PostMapping("/parameters")
  public ResponseEntity<ParameterDto> savePoint(@RequestBody ParameterDto parameterDto) {
    return new ResponseEntity<>(parameterMapper.toDto(parameterService.saveParameter(parameterMapper.toDomain(parameterDto))),HttpStatus.CREATED);

  }

  @SuppressWarnings("deprecation")
private void addSelfLink(EntityModel<ParameterDto> resource) {
	  
	  Long id = new Long(resource.getContent().getId());
	  resource.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).singleSelectRule(id.intValue())).withSelfRel());
  }

  
}