package com.mrisk.monitoreo.application.service;

import java.util.List;

import com.mrisk.monitoreo.application.repository.ComponentRepository;
import com.mrisk.monitoreo.domain.Component;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class ComponentService {

  private final ComponentRepository repository;
  
  public List<Component> getComponentAll() {
	    return repository.getComponentAll();
  }
  
  public Component getComponent(Long id) {
    return repository.findById(id);
  }

  public Component saveComponent(Component component) {

    return repository.save(component);

  }
}
