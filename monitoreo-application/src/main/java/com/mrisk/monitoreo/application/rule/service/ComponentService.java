package com.mrisk.monitoreo.application.rule.service;

import java.util.Objects;

import com.mrisk.monitoreo.application.rule.exception.DataNotFoundException;
import com.mrisk.monitoreo.application.rule.repository.ComponentRepository;
import com.mrisk.monitoreo.rule.domain.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ComponentService {
    private final ComponentRepository repository;
    private static final String DATA_NOT_FOUND = "Data Not Found";

    public Component findComponentById(Integer id) {
        Component objComponent = repository.findById(id);
        if (Objects.nonNull(objComponent)) {
            return objComponent;
        }
        throw new DataNotFoundException(DATA_NOT_FOUND);
    }
}
