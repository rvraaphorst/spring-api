package io.trackbee.test;

import io.trackbee.test.model.StorePlatformConnection;
import io.trackbee.test.service.StorePlatformConnectionService;
import io.trackbee.test.service.StoreService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StorePlatformConnectionTest {

	@Autowired
	private StoreService storeService;

	@Autowired
	private StorePlatformConnectionService service;

	@Test
	public void testGetStorePlatformConnectionById() {
		StorePlatformConnection store = service.getById(5L);
		assertThat(store.getPlatformType()).isEqualTo("TIKTOK");
	}

	@Test
	public void testList() {
		List<StorePlatformConnection> list = service.getAll();
		assertThat(list.size()).isEqualTo(5);
	}
}
