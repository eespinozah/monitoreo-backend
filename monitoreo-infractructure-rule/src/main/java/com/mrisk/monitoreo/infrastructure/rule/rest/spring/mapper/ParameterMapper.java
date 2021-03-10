package com.mrisk.monitoreo.infrastructure.rule.rest.spring.mapper;

import org.mapstruct.Mapper;

import com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto.ParameterDto;
import com.mrisk.monitoreo.rule.domain.Parameter;

@Mapper(componentModel = "spring")
public interface ParameterMapper {

	ParameterDto toDto (Parameter Parameter);
	Parameter toDomain(ParameterDto parameterDto);
}
