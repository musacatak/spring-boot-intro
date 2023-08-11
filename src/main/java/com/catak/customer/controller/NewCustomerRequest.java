package com.catak.customer.controller;

import com.catak.customer.entity.Customer;

public record NewCustomerRequest(
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
