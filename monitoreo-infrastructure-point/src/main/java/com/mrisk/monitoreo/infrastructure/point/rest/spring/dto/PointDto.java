package com.mrisk.monitoreo.infrastructure.point.rest.spring.dto;

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
public class PointDto extends RepresentationModel<PointDto>{
  private Integer poin_id;
  private Integer tenaId;
  private Boolean alive = Boolean.TRUE;
  private Calendar creationTime = Calendar.getInstance();
  private Calendar modificationTime;
  private Calendar destructionTime;
  private Integer accoId;
  private Integer sectId;
  private String name;
  private String nameInternal;
  private String description;
//  private String datum;
//  private Double x;
//  private Double y;
}
