package com.mrisk.monitoreo.infrastructure.point.rest.spring.mapper;

import com.mrisk.monitoreo.domain.Point;
import com.mrisk.monitoreo.infrastructure.point.rest.spring.dto.PointDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-12T09:19:16-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class PointMapperImpl implements PointMapper {

    @Override
    public PointDto toDto(Point point) {
        if ( point == null ) {
            return null;
        }

        PointDto pointDto = new PointDto();

        pointDto.setPoin_id( point.getPoin_id() );
        pointDto.setTenaId( point.getTenaId() );
        pointDto.setAlive( point.getAlive() );
        pointDto.setCreationTime( point.getCreationTime() );
        pointDto.setModificationTime( point.getModificationTime() );
        pointDto.setDestructionTime( point.getDestructionTime() );
        pointDto.setAccoId( point.getAccoId() );
        pointDto.setSectId( point.getSectId() );
        pointDto.setName( point.getName() );
        pointDto.setNameInternal( point.getNameInternal() );
        pointDto.setDescription( point.getDescription() );
        pointDto.setCoordinateX( point.getCoordinateX() );
        pointDto.setCoordinateY( point.getCoordinateY() );
        pointDto.setDatum( point.getDatum() );

        return pointDto;
    }

    @Override
    public Point toDomain(PointDto pointDto) {
        if ( pointDto == null ) {
            return null;
        }

        Point point = new Point();

        point.setPoin_id( pointDto.getPoin_id() );
        point.setTenaId( pointDto.getTenaId() );
        point.setAlive( pointDto.getAlive() );
        point.setCreationTime( pointDto.getCreationTime() );
        point.setModificationTime( pointDto.getModificationTime() );
        point.setDestructionTime( pointDto.getDestructionTime() );
        point.setAccoId( pointDto.getAccoId() );
        point.setSectId( pointDto.getSectId() );
        point.setName( pointDto.getName() );
        point.setNameInternal( pointDto.getNameInternal() );
        point.setDescription( pointDto.getDescription() );
        point.setCoordinateX( pointDto.getCoordinateX() );
        point.setCoordinateY( pointDto.getCoordinateY() );
        point.setDatum( pointDto.getDatum() );

        return point;
    }
}
