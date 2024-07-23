package io.trackbee.test.service;

import io.trackbee.test.model.ConnectionCredentials;
import io.trackbee.test.repository.ConnectionCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionCredentialsService {

	@Autowired
	private ConnectionCredentialsRepository connectionCredentialsRepository;

	public List<ConnectionCredentials> getAll() {
		return connectionCredentialsRepository.findAll();
	}

	public ConnectionCredentials getById(Long id) {
		return connectionCredentialsRepository.findById(id).orElse(null);
	}

	public ConnectionCredentials create(ConnectionCredentials store) {
		return connectionCredentialsRepository.save(store);
	}

	public ConnectionCredentials update(ConnectionCredentials store) {
		return connectionCredentialsRepository.save(store);
	}

	public void delete(Long id) {
		connectionCredentialsRepository.deleteById(id);
	}
} 
