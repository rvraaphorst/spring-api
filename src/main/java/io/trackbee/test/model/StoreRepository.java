package io.trackbee.test.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>, Serializable {

}
