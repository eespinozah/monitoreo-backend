package com.mrisk.monitoreo.infrastructure.point.db.springjdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.mrisk.monitoreo.application.repository.PointRepository;
import com.mrisk.monitoreo.domain.Point;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class PointJdbcRepository implements PointRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
  public List<Point> massiveSelectPoint(){
	  
	  List<Point> listPoint = new ArrayList<Point>();
	  return listPoint;
  }
  
@SuppressWarnings("deprecation")
@Override
  public Point singleSelectPoint(Integer id) {
	  
	  String sql = "SELECT tena_id, poin_id, alive, creation_time, modification_time, destruction_time, acco_id, name, name_internal, sect_id, description FROM point where poin_id = ?";
      try {
    	
          return jdbcTemplate.queryForObject(sql, new Object[]{id}, new PointMapper());
      } catch (EmptyResultDataAccessException noResult) {
          
          return null;
      }
  }
	public Point save(Point point) {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(this.jdbcTemplate).withTableName("point").usingGeneratedKeyColumns("poin_id");
		
		SqlParameterSource parameters = new BeanPropertySqlParameterSource(point);
        Number newId = insert.executeAndReturnKey(parameters);
        point.setPoin_id(newId.intValue());
        return point;
	}
}
