package io.trackbee.test.repository;

import io.trackbee.test.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>, Serializable {

}
