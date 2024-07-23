package io.trackbee.test.service;

import io.trackbee.test.model.ConnectionCredentials;
import io.trackbee.test.model.StorePlatformConnection;
import io.trackbee.test.repository.StorePlatformConnectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorePlatformConnectionService {

	@Autowired
	private StorePlatformConnectionRepository storePlatformConnectionRepository;

	public List<StorePlatformConnection> getAll() {
		return storePlatformConnectionRepository.findAll();
	}

	public StorePlatformConnection getById(Long id) {
		return storePlatformConnectionRepository.findById(id).orElse(null);
	}

	public StorePlatformConnection create(StorePlatformConnection storePlatformConnection) {
		return storePlatformConnectionRepository.save(storePlatformConnection);
	}

	public StorePlatformConnection update(StorePlatformConnection storePlatformConnection) {
		return storePlatformConnectionRepository.save(storePlatformConnection);
	}

	public void delete(Long id) {
		storePlatformConnectionRepository.deleteById(id);
	}
} 
