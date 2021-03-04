package com.mrisk.monitoreo.infrastructure.rule.rest.spring.mapper;

import com.mrisk.monitoreo.domain.Storage;
import com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto.StorageDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-04T12:49:17-0300",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class StorageMapperImpl implements StorageMapper {

    @Override
    public StorageDto toDto(Storage storage) {
        if ( storage == null ) {
            return null;
        }

        StorageDto storageDto = new StorageDto();

        storageDto.setId( storage.getId() );
        storageDto.setName( storage.getName() );
        storageDto.setPointId( storage.getPointId() );

        return storageDto;
    }

    @Override
    public Storage toDomain(StorageDto storageDto) {
        if ( storageDto == null ) {
            return null;
        }

        Storage storage = new Storage();

        storage.setId( storageDto.getId() );
        storage.setName( storageDto.getName() );
        storage.setPointId( storageDto.getPointId() );

        return storage;
    }
}
