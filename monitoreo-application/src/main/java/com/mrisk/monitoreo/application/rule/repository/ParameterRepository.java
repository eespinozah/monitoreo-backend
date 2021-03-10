package com.mrisk.monitoreo.application.rule.repository;

import com.mrisk.monitoreo.rule.domain.Parameter;

public interface ParameterRepository  {

	Parameter save(Parameter parameter);

	Parameter singleSelectParameter(Integer id);

}
