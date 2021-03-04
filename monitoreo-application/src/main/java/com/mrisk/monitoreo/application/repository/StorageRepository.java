package com.mrisk.monitoreo.application.repository;

import java.util.List;

import com.mrisk.monitoreo.domain.Storage;

public interface StorageRepository {
	
	List<Storage> getStorageAll();
	
	Storage findById(Long id);

	Storage save(Storage storage);

}
