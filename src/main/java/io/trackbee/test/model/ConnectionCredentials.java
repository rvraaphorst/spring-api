package io.trackbee.test.model;

import jakarta.persistence.*;

@Entity
@Table(name = "connectionCredentials")
public class ConnectionCredentials {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@OneToOne
	private StorePlatformConnection storePlatformConnection;

	private String pixelId;

	private String pixelAccessToken;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StorePlatformConnection getStorePlatformConnection() {
		return storePlatformConnection;
	}

	public void setStorePlatformConnection(StorePlatformConnection storePlatformConnection) {
		this.storePlatformConnection = storePlatformConnection;
	}

	public String getPixelId() {
		return pixelId;
	}

	public void setPixelId(String pixelId) {
		this.pixelId = pixelId;
	}

	public String getPixelAccessToken() {
		return pixelAccessToken;
	}

	public void setPixelAccessToken(String pixelAccessToken) {
		this.pixelAccessToken = pixelAccessToken;
	}
}
