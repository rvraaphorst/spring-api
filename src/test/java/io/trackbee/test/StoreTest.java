package io.trackbee.test;

import io.trackbee.test.model.Store;
import io.trackbee.test.model.StoreService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StoreTest {

	@Autowired
	private StoreService storeService;

	@Test
	public void testGetStoreById() {
		Store store = storeService.getById(1L);
		assertThat(store.getApiKey()).isEqualTo("1-AB");
	}

	@Test
	public void testList() {
		List<Store> list = storeService.getAll();
		assertThat(list.size()).isEqualTo(3);
	}

	@Test
	public void testCreate() {
		Store store = new Store();
		store.setApiKey("test");
		store.setName("new store");
		storeService.create(store);
	}

	@Test
	public void testUpdate() {
		String API_KEY = "new-api-key";
		Store store = storeService.getById(2L);
		store.setApiKey(API_KEY);
		storeService.update(store);

		// TODO: Flush dataabase - we're not getting it from memory
		Store store2 = storeService.getById(2L);
		assertThat(store2.getApiKey()).isEqualTo(API_KEY);
	}

}
