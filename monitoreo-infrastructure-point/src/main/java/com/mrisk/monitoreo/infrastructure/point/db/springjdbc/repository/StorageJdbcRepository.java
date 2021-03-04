package com.mrisk.monitoreo.infrastructure.point.db.springjdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.mrisk.monitoreo.application.repository.StorageRepository;
import com.mrisk.monitoreo.domain.Storage;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class StorageJdbcRepository implements StorageRepository {

	private final JdbcTemplate jdbcTemplate;
//	private final StorageEntityMapper storageMapper;
	@Autowired
    public StorageJdbcRepository(DataSource dataSource) {
      
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
  public List<Storage> getStorageAll(){
	  
	  List<Storage> listStorage = new ArrayList<Storage>();
	  return listStorage;
  }
  
  @Override
  public Storage findById(Long id) {
    return null;
  }

  @Override
  public Storage save(Storage storage) {
	  
//    return storageMapper.toDomain(storageRepository.save(storageMapper.toDbo(storage)));
	  
	  System.out.println(storage.getName());
	  System.out.println(storage.getPointId());

	  final String sql = "insert into storage (name, point_id) values (?, ?)";
      final KeyHolder holder = new GeneratedKeyHolder();

      jdbcTemplate.update(new PreparedStatementCreator() {

          @Override
          public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
        	  
              final PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
              ps.setString(1, storage.getName());
              ps.setLong(2, storage.getPointId());
              
              return ps;
          }
      }, holder);

      
      Storage storageNew = new Storage();
      storageNew.setId(holder.getKey().longValue());
      storageNew.setName(storage.getName());
      storageNew.setPointId(storage.getPointId());
      return storageNew;

  }
}
