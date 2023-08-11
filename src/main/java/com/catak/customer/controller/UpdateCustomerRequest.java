package com.catak.customer.controller;

import com.catak.customer.entity.Customer;

public record UpdateCustomerRequest(
        String name,
        String email,
        Integer age
) {

    public Customer toEntity() {
        return new Customer(
                name,
                email,
                age
        );
    }

}
