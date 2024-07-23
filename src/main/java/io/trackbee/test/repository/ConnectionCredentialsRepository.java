package io.trackbee.test.repository;

import io.trackbee.test.model.ConnectionCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ConnectionCredentialsRepository extends JpaRepository<ConnectionCredentials, Long>, Serializable {

}
