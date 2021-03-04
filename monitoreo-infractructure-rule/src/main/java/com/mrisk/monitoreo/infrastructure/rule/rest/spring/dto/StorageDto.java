package com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StorageDto extends RepresentationModel<StorageDto>{
  private Long id;
  private String name;
  private Long pointId;
}
