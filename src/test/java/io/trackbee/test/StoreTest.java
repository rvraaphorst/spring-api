package io.trackbee.test;

import io.trackbee.test.model.Store;
import io.trackbee.test.service.StoreService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StoreTest {

	@Autowired
	private StoreService service;

	@Test
	public void testGetId() {
		Store store = service.getById(1L);
		assertThat(store.getApiKey()).isEqualTo("1-AB");
	}

	@Test
	public void testList() {
		List<Store> list = service.getAll();
		assertThat(list.size()).isEqualTo(3);
	}

	@Test
	public void testCreate() {
		Store store = new Store();
		store.setApiKey("test");
		store.setName("new store");
		service.create(store);
	}

	@Test
	public void testUpdate() {
		String API_KEY = "new-api-key";
		Store store = service.getById(2L);
		store.setApiKey(API_KEY);
		service.update(store);

		// TODO: Flush dataabase - we're not getting it from memory
		Store store2 = service.getById(2L);
		assertThat(store2.getApiKey()).isEqualTo(API_KEY);
	}

}
