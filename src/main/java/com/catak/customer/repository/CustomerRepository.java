package com.catak.customer.repository;

import com.catak.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        extends JpaRepository<Customer, Integer> {

}
