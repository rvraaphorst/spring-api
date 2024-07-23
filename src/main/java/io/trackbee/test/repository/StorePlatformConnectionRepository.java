package io.trackbee.test.repository;

import io.trackbee.test.model.StorePlatformConnection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StorePlatformConnectionRepository
	extends JpaRepository<StorePlatformConnection, Long>, Serializable {

}
