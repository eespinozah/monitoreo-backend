package com.mrisk.monitoreo.infrastructure.point.rest.spring.mapper;

import com.mrisk.monitoreo.domain.Point;
import com.mrisk.monitoreo.infrastructure.point.rest.spring.dto.PointDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-10T13:35:34-0300",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class PointMapperImpl implements PointMapper {

    @Override
    public PointDto toDto(Point point) {
        if ( point == null ) {
            return null;
        }

        PointDto pointDto = new PointDto();

        pointDto.setAccoId( point.getAccoId() );
        pointDto.setAlive( point.getAlive() );
        pointDto.setCoordinateX( point.getCoordinateX() );
        pointDto.setCoordinateY( point.getCoordinateY() );
        pointDto.setCreationTime( point.getCreationTime() );
        pointDto.setDatum( point.getDatum() );
        pointDto.setDescription( point.getDescription() );
        pointDto.setDestructionTime( point.getDestructionTime() );
        pointDto.setModificationTime( point.getModificationTime() );
        pointDto.setName( point.getName() );
        pointDto.setNameInternal( point.getNameInternal() );
        pointDto.setPoin_id( point.getPoin_id() );
        pointDto.setSectId( point.getSectId() );
        pointDto.setTenaId( point.getTenaId() );

        return pointDto;
    }

    @Override
    public Point toDomain(PointDto pointDto) {
        if ( pointDto == null ) {
            return null;
        }

        Point point = new Point();

        point.setAccoId( pointDto.getAccoId() );
        point.setAlive( pointDto.getAlive() );
        point.setCoordinateX( pointDto.getCoordinateX() );
        point.setCoordinateY( pointDto.getCoordinateY() );
        point.setCreationTime( pointDto.getCreationTime() );
        point.setDatum( pointDto.getDatum() );
        point.setDescription( pointDto.getDescription() );
        point.setDestructionTime( pointDto.getDestructionTime() );
        point.setModificationTime( pointDto.getModificationTime() );
        point.setName( pointDto.getName() );
        point.setNameInternal( pointDto.getNameInternal() );
        point.setPoin_id( pointDto.getPoin_id() );
        point.setSectId( pointDto.getSectId() );
        point.setTenaId( pointDto.getTenaId() );

        return point;
    }
}
