package io.trackbee.test.repository;

import io.trackbee.test.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>, Serializable {

}
