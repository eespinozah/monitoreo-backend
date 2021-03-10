package com.mrisk.monitoreo.infrastructure.rule.rest.spring.mapper;

import org.mapstruct.Mapper;

import com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto.RuleDto;
import com.mrisk.monitoreo.rule.domain.Rule;

@Mapper(componentModel = "spring")
public interface RuleMapper {

  RuleDto toDto (Rule rule);

  Rule toDomain(RuleDto ruleDto);
}
