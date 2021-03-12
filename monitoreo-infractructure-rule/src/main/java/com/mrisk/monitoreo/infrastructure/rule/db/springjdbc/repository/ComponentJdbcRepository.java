package com.mrisk.monitoreo.infrastructure.rule.db.springjdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.mrisk.monitoreo.application.rule.repository.ComponentRepository;
import com.mrisk.monitoreo.rule.domain.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ComponentJdbcRepository implements ComponentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Component findById(Integer id) {
        String sql = "SELECT comp_id,name,description FROM component where comp_id = ?";
        try {

            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Component>(Component.class), id);

        } catch (EmptyResultDataAccessException noResult) {

            return null;
        }
    }

}
