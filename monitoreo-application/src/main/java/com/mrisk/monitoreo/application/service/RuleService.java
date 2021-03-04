package com.mrisk.monitoreo.application.service;

import java.util.List;

import com.mrisk.monitoreo.application.repository.RuleRepository;
import com.mrisk.monitoreo.domain.Rule;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RuleService {

  private final RuleRepository repository;
  
  public List<Rule> getComponentAll() {
	    return repository.getRuleAll();
  }
  
  public Rule getComponent(Long id) {
    return repository.findById(id);
  }

  public Rule saveComponent(Rule rule) {

    return repository.save(rule);

  }
}
