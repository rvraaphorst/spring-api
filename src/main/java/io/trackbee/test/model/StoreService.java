package io.trackbee.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

	@Autowired
	private StoreRepository storeRepository;

	public List<Store> getAll() {
		return storeRepository.findAll();
	}

	public Store getById(Long id) {
		return storeRepository.findById(id).orElse(null);
	}

	public Store create(Store store) {

		return storeRepository.save(store);
	}

	public Store update(Store store) {
		return storeRepository.save(store);
	}

	public void delete(Long id) {

		storeRepository.deleteById(id);
	}
} 
