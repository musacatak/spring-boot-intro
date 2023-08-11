package com.catak.customer.controller;

import com.catak.customer.entity.Customer;
import com.catak.customer.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody NewCustomerRequest request) {

        return customerService.addCustomer(request.toEntity());

    }

    @PutMapping("{id}")
    public String updateCustomer(@PathVariable("id") Integer id, @RequestBody UpdateCustomerRequest request) {
        return customerService.updateCustomer(id, request.toEntity());

    }

    @DeleteMapping("{customerId}")
    public String deleteCustomer(@PathVariable("customerId") Integer id) {
        return customerService.deleteCustomer(id);

    }
}