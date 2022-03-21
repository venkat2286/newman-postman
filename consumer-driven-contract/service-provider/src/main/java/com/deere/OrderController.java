package com.deere;

import com.deere.OrderService.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.isNull;
import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/orders/{orderId}", produces = "application/json")
    public ResponseEntity<Order> getOrder(@PathVariable("orderId") String orderId) {
        Order order = orderService.getOrder(orderId);
        if (isNull(order)) {
            return notFound().build();
        }
        return ok(order);
    }
}
