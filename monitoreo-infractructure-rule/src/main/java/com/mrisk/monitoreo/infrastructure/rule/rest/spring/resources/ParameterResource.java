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
import com.mrisk.monitoreo.infrastructure.rule.rest.spring.mapper.Converter;
import com.mrisk.monitoreo.rule.domain.Parameter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ParameterResource {

	private final ParameterService parameterService;

	@GetMapping("/parameters/{id}")
	public ResponseEntity<EntityModel<ParameterDto>> singleSelectRule(@PathVariable Integer id) {

		ParameterDto parameterDto = Converter.getMapper().map(parameterService.singleSelectParameter(id),
				ParameterDto.class);

		EntityModel<ParameterDto> resource = EntityModel.of(parameterDto);

		addSelfLink(resource);

		return new ResponseEntity<>((resource), HttpStatus.OK);
	}

	@PostMapping("/parameters")
	public ResponseEntity<ParameterDto> saveParameter(@RequestBody ParameterDto parameterDto) {
		return new ResponseEntity<>(Converter.getMapper().map(
				parameterService.saveParameter(Converter.getMapper().map(parameterDto, Parameter.class)),
				ParameterDto.class), HttpStatus.CREATED);

	}

	private void addSelfLink(EntityModel<ParameterDto> resource) {
		Long id = resource.getContent().getId();
		resource.add(WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).singleSelectRule(id.intValue())).withSelfRel());
	}

}