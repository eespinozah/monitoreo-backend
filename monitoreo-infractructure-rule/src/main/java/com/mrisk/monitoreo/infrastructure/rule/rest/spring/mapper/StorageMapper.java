package com.mrisk.monitoreo.infrastructure.rule.rest.spring.mapper;

import org.mapstruct.Mapper;

import com.mrisk.monitoreo.domain.Storage;
import com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto.StorageDto;

@Mapper(componentModel = "spring")
public interface StorageMapper {

	StorageDto toDto (Storage storage);
	
	Storage toDomain(StorageDto storageDto);
}
