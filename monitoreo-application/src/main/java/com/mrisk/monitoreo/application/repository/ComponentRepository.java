package com.mrisk.monitoreo.application.repository;

import java.util.List;

import com.mrisk.monitoreo.domain.Component;

public interface ComponentRepository {
	
	List<Component> getComponentAll();
	
	Component findById(Long id);

	Component save(Component point);

}
