package com.mrisk.monitoreo.infrastructure.point.rest.spring.mapper;

import com.mrisk.monitoreo.domain.Storage;
import com.mrisk.monitoreo.infrastructure.point.rest.spring.dto.StorageDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-11T16:45:10-0300",
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

        storageDto.setAlive( storage.getAlive() );
        storageDto.setContentType( storage.getContentType() );
        storageDto.setCreationTime( storage.getCreationTime() );
        storageDto.setDestructionTime( storage.getDestructionTime() );
        storageDto.setEncoding( storage.getEncoding() );
        storageDto.setId( storage.getId() );
        storageDto.setModificationTime( storage.getModificationTime() );
        storageDto.setName( storage.getName() );
        storageDto.setPointId( storage.getPointId() );
        storageDto.setTenaId( storage.getTenaId() );
        storageDto.setType( storage.getType() );

        return storageDto;
    }

    @Override
    public Storage toDomain(StorageDto storageDto) {
        if ( storageDto == null ) {
            return null;
        }

        Storage storage = new Storage();

        storage.setAlive( storageDto.getAlive() );
        storage.setContentType( storageDto.getContentType() );
        storage.setCreationTime( storageDto.getCreationTime() );
        storage.setDestructionTime( storageDto.getDestructionTime() );
        storage.setEncoding( storageDto.getEncoding() );
        storage.setId( storageDto.getId() );
        storage.setModificationTime( storageDto.getModificationTime() );
        storage.setName( storageDto.getName() );
        storage.setPointId( storageDto.getPointId() );
        storage.setTenaId( storageDto.getTenaId() );
        storage.setType( storageDto.getType() );

        return storage;
    }
}
