package com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto;

import java.util.Calendar;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParameterDto extends RepresentationModel<ParameterDto>{
	private Long id;
    private String name;
    private String symbol;
    private String unit;
    private boolean isDiscreet;
    
    private Integer tenaId;
    private Boolean alive = Boolean.TRUE;
    private Calendar creationTime = Calendar.getInstance();
    private Calendar modificationTime;
    private Calendar destructionTime;
    
}
