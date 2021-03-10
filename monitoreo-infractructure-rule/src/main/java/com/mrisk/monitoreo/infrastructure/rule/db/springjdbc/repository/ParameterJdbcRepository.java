package com.mrisk.monitoreo.infrastructure.rule.db.springjdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import com.mrisk.monitoreo.application.rule.repository.ParameterRepository;
import com.mrisk.monitoreo.rule.domain.Parameter;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ParameterJdbcRepository implements ParameterRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public Parameter save(Parameter parameter) {
	
		SimpleJdbcInsert insert = new SimpleJdbcInsert(this.jdbcTemplate).withTableName("parameter").usingGeneratedKeyColumns("para_id");
		
		SqlParameterSource parameters = new BeanPropertySqlParameterSource(parameter);
        Number newId = insert.executeAndReturnKey(parameters);
        parameter.setId(newId.intValue());
        return parameter;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public Parameter singleSelectParameter(Integer id) {
		
		String sql = "SELECT tena_id, para_id, alive, creation_time, modification_time, destruction_time, csub_id, name, symbol, unit_id, discrete FROM parameter where para_id = ?";
	      try {
	    	  
			@SuppressWarnings({ "deprecation", "rawtypes" })
			Parameter parameter = (Parameter) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(Parameter.class));	  
			return parameter;
	    			  
	      } catch (EmptyResultDataAccessException noResult) {
	          
	          return null;
	      }
		
		
	}

	
	
}
