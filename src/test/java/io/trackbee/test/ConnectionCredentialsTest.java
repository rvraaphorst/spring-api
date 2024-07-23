package io.trackbee.test;

import io.trackbee.test.model.ConnectionCredentials;
import io.trackbee.test.model.Store;
import io.trackbee.test.model.StorePlatformConnection;
import io.trackbee.test.service.ConnectionCredentialsService;
import io.trackbee.test.service.StorePlatformConnectionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ConnectionCredentialsTest {

	@Autowired
	private ConnectionCredentialsService service;

	@Test
	public void testGetById() {
		ConnectionCredentials connectionCredentials = service.getById(1L);
		assertThat(connectionCredentials.getPixelId()).isEqualTo("PIXEL-ID-1");

		StorePlatformConnection storePlatformConnection = connectionCredentials.getStorePlatformConnection();
		assertThat(storePlatformConnection.getPlatformType()).isEqualTo("META");
	}

	@Test
	public void testList() {
		List<ConnectionCredentials> list = service.getAll();
		assertThat(list.size()).isEqualTo(5);
	}
}
