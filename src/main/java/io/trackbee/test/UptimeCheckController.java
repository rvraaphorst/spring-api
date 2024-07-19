package io.trackbee.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling uptime-check requests.
 */
@RestController
public class UptimeCheckController {

  /**
   * The uptime-check endpoint.
   */
  @GetMapping("/uptime-check")
  public void uptimeCheck() {}
}

