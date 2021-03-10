package com.mrisk.monitoreo.application.rule.service;

import com.mrisk.monitoreo.application.rule.repository.ParameterRepository;
import com.mrisk.monitoreo.rule.domain.Parameter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ParameterService {

  private final ParameterRepository repository;
  
  	public Parameter singleSelectParameter(Integer id) {
	    return repository.singleSelectParameter(id);
	}

	  public Parameter saveParameter(Parameter parameter) {

	    return repository.save(parameter);

	  }
}
