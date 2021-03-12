package com.mrisk.monitoreo.infrastructure.point.rest.spring.mapper;

import com.mrisk.monitoreo.domain.Storage;
import com.mrisk.monitoreo.infrastructure.point.rest.spring.dto.StorageDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-12T09:19:17-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
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
        storageDto.setType( storage.getType() );
        storageDto.setEncoding( storage.getEncoding() );
        storageDto.setContentType( storage.getContentType() );
        storageDto.setPointId( storage.getPointId() );
        storageDto.setTenaId( storage.getTenaId() );
        storageDto.setAlive( storage.getAlive() );
        storageDto.setCreationTime( storage.getCreationTime() );
        storageDto.setModificationTime( storage.getModificationTime() );
        storageDto.setDestructionTime( storage.getDestructionTime() );

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
        storage.setType( storageDto.getType() );
        storage.setEncoding( storageDto.getEncoding() );
        storage.setContentType( storageDto.getContentType() );
        storage.setPointId( storageDto.getPointId() );
        storage.setTenaId( storageDto.getTenaId() );
        storage.setAlive( storageDto.getAlive() );
        storage.setCreationTime( storageDto.getCreationTime() );
        storage.setModificationTime( storageDto.getModificationTime() );
        storage.setDestructionTime( storageDto.getDestructionTime() );

        return storage;
    }
}
