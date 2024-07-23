package io.trackbee.test.service;

import io.trackbee.test.model.Order;
import io.trackbee.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderService;

	public List<Order> getAll() {
		return orderService.findAll();
	}

	public Order getById(Long id) {
		return orderService.findById(id).orElse(null);
	}

	public Order create(Order order) {
		return orderService.save(order);
	}

	public Order update(Order order) {
		return orderService.save(order);
	}

	public void delete(Long id) {
		orderService.deleteById(id);
	}
} 
