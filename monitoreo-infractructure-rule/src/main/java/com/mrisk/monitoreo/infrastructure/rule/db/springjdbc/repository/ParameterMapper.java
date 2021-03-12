package com.mrisk.monitoreo.infrastructure.rule.db.springjdbc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mrisk.monitoreo.rule.domain.Parameter;

public class ParameterMapper implements RowMapper<Parameter> {
	
    @Override
    public Parameter mapRow(ResultSet rs, int rowNum) throws SQLException {
    	
        final Parameter parameter = new Parameter();
        parameter.setId(rs.getInt("para_id"));  
        parameter.setName(rs.getString("name"));
        parameter.setSymbol(rs.getString("name_internal"));
        parameter.setUnit(rs.getString("name"));
        parameter.setDiscreet(rs.getBoolean("alive"));
        return parameter;
    }
}
