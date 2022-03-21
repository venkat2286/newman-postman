package com.deere;

import org.springframework.beans.factory.annotation.Autowired;
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
public class CustomerController {


    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/customers/{id}", produces = "application/json")
    public ResponseEntity<CustomerService.Customer> getOrder(@PathVariable("id") String id) {
        CustomerService.Customer customer = customerService.getCustomer(id);
        if (isNull(customer)) {
            return notFound().build();
        }
        return ok(customer);
    }
}
