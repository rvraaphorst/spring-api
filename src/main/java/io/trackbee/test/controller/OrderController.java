package io.trackbee.test.controller;

import io.trackbee.test.model.Order;
import io.trackbee.test.model.Store;
import io.trackbee.test.request.OrderRequest;
import io.trackbee.test.service.OrderService;
import io.trackbee.test.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private StoreService storeService;

	@Autowired
	private OrderService orderService;

	@PostMapping("")
	public ModelAndView createOrder(
		@RequestHeader("X-Authorization") String apiKey, @RequestBody OrderRequest body
	) {
		if(apiKey == null) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setStatus(HttpStatus.UNAUTHORIZED);
			return modelAndView;
		}

		Store store = storeService.getByApiKey(apiKey);
		if (store == null) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setStatus(HttpStatus.UNAUTHORIZED);
			return modelAndView;
		}

		// TODO: Validate JSON - Do we need to do that ourselves or does Spring does validation for the
		// request body?
		// Return a BAD_REQUEST when json is invalid

		// Store order
		Order order = new Order();
		order.setGivenId(body.getId());
		order.setPrice(new BigDecimal(body.getPrice()));

		// TODO: Check: is the given timestamp in UTC?
		Instant instant = Instant.ofEpochMilli(body.getTimestamp());
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("UTC"));
		order.setTimestamp(localDateTime);

		storeService.create(store);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setStatus(HttpStatus.CREATED);

		// TODO:
		// Loop store.getStorePlatformConnections() and
		// send the order, the pixelId and pixelAccessToken to these connections

		return modelAndView;
	}
}
