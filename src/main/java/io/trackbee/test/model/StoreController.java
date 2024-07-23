package io.trackbee.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@GetMapping("")
	public List<Store> getAllStores() {
		return storeService.getAll();
	}

	@GetMapping("/{id}")
	public Store getStoreById(@PathVariable Long id) {
		return storeService.getById(id);
	}

	@PostMapping("")
	public Store createStore(@RequestBody Store store) {
		return storeService.create(store);
	}

	@PutMapping("/{id}")
	public Store updateStore(@PathVariable Long id, @RequestBody Store store) {
		return storeService.update(store);
	}

	@DeleteMapping("/{id}")
	public void deleteStore(@PathVariable Long id) {
		storeService.delete(id);
	}
} 
