package com.mrisk.monitoreo.infrastructure.rule.db.springjdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
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
  
  @Override
  public Point singleSelectPoint(Integer id) {
    return null;
  }

@Override
  public Point save(Point point) {
	  
//    return storageMapper.toDomain(storageRepository.save(storageMapper.toDbo(storage)));
	  
	  System.out.println(point.getName());
	  final String sql = "insert into point (tena_id, alive, creation_time, acco_id, name, name_internal, sect_id, description) values (?, ?, ?, ?, ?, ?, ?, ?)";
      final KeyHolder holder = new GeneratedKeyHolder();

      jdbcTemplate.update(new PreparedStatementCreator() {

          @Override
          public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
        	  
              final PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
              
              preparedStatement.setInt(1, point.getTenaId());
              preparedStatement.setBoolean(2, point.getAlive());
              preparedStatement.setTimestamp(3, new Timestamp(point.getCreationTime().getTimeInMillis()));
                
//              preparedStatement.setTimestamp(4, new Timestamp(point.getModificationTime().getTimeInMillis()));
//              preparedStatement.setTimestamp(5, new Timestamp(point.getDestructionTime().getTimeInMillis()));
              preparedStatement.setInt(4, point.getAccoId());
              preparedStatement.setString(5, point.getName());
              preparedStatement.setString(6, point.getNameInternal());
              preparedStatement.setInt(7, point.getSectId());
              preparedStatement.setString(8, point.getDescription()); 
             
              return preparedStatement;
          }
      }, holder);

      
      Point pointNew = new Point();
      
      Integer newId;
      if (holder.getKeys().size() > 1) {
          newId = (Integer)holder.getKeys().get("poin_id");
      } else {
          newId= holder.getKey().intValue();
      }
      
      pointNew.setPoin_id(newId);
      pointNew.setTenaId(point.getTenaId());
      pointNew.setAlive(point.getAlive());
      
      pointNew.setCreationTime(point.getCreationTime());
      pointNew.setModificationTime(point.getModificationTime());
      pointNew.setDestructionTime(point.getDestructionTime());
      pointNew.setAccoId(point.getAccoId());
      pointNew.setName(point.getName());
      pointNew.setNameInternal(point.getNameInternal());
      pointNew.setSectId(point.getSectId());
      pointNew.setDescription(point.getDescription());
      
      
      return pointNew;

  }
}
