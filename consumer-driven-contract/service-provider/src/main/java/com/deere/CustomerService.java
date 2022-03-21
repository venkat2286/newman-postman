package com.deere;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomerService {

    static Map<String, Customer> customers = Map.of(
            "1", new Customer("1", "Venkat Mallapally", "vm@gmail.com"),
            "2", new Customer("2", "Bill Hale", "bh@gmail.com"),
            "3", new Customer("3", "Pravin", "pt@gmail.com"),
            "4", new Customer("3", "Purushotham", "pa@gmail.com")

    );

    public Customer getCustomer(String customerId) {
       return customers.get(customerId);
    }

    @Data
    @AllArgsConstructor
    static class Customer {
        private String id;
        private String customerName;
        private String email;

    }
}
