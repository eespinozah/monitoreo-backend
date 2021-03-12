package com.mrisk.monitoreo.application.rule.repository;

import com.mrisk.monitoreo.rule.domain.Component;

public interface ComponentRepository {

    Component findById(Integer id);

}
