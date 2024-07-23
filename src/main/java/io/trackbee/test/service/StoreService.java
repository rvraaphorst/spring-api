package io.trackbee.test.service;

import io.trackbee.test.model.Store;
import io.trackbee.test.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

	@Autowired
	private StoreRepository storeService;

	public List<Store> getAll() {
		return storeService.findAll();
	}

	public Store getById(Long id) {
		return storeService.findById(id).orElse(null);
	}

	public Store getByApiKey(String apiKey) { return storeService.findByapiKey(apiKey);}

	public Store create(Store store) {
		return storeService.save(store);
	}

	public Store update(Store store) {
		return storeService.save(store);
	}

	public void delete(Long id) {
		storeService.deleteById(id);
	}
} 
