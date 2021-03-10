package com.mrisk.monitoreo.infrastructure.rule.rest.spring.mapper;

import com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto.ParameterDto;
import com.mrisk.monitoreo.rule.domain.Parameter;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-10T13:35:34-0300",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class ParameterMapperImpl implements ParameterMapper {

    @Override
    public ParameterDto toDto(Parameter Parameter) {
        if ( Parameter == null ) {
            return null;
        }

        ParameterDto parameterDto = new ParameterDto();

        parameterDto.setAlive( Parameter.getAlive() );
        parameterDto.setCreationTime( Parameter.getCreationTime() );
        parameterDto.setDestructionTime( Parameter.getDestructionTime() );
        parameterDto.setDiscreet( Parameter.isDiscreet() );
        if ( Parameter.getId() != null ) {
            parameterDto.setId( Parameter.getId().longValue() );
        }
        parameterDto.setModificationTime( Parameter.getModificationTime() );
        parameterDto.setName( Parameter.getName() );
        parameterDto.setSymbol( Parameter.getSymbol() );
        parameterDto.setTenaId( Parameter.getTenaId() );
        parameterDto.setUnit( Parameter.getUnit() );

        return parameterDto;
    }

    @Override
    public Parameter toDomain(ParameterDto parameterDto) {
        if ( parameterDto == null ) {
            return null;
        }

        Parameter parameter = new Parameter();

        parameter.setAlive( parameterDto.getAlive() );
        parameter.setCreationTime( parameterDto.getCreationTime() );
        parameter.setDestructionTime( parameterDto.getDestructionTime() );
        parameter.setDiscreet( parameterDto.isDiscreet() );
        if ( parameterDto.getId() != null ) {
            parameter.setId( parameterDto.getId().intValue() );
        }
        parameter.setModificationTime( parameterDto.getModificationTime() );
        parameter.setName( parameterDto.getName() );
        parameter.setSymbol( parameterDto.getSymbol() );
        parameter.setTenaId( parameterDto.getTenaId() );
        parameter.setUnit( parameterDto.getUnit() );

        return parameter;
    }
}
