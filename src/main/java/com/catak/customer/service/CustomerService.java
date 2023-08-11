package com.catak.customer.service;


import com.catak.customer.entity.Customer;
import com.catak.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer) {

        customerRepository.save(customer);

        return customer;

    }

    public String updateCustomer(Integer id, Customer newCustomer) {
        try {
            Customer updateCustomer = customerRepository.findById(id)
                    .orElseThrow(() -> new Exception("Employee not exist with id: " + id));

            updateCustomer.update(newCustomer);

            customerRepository.save(updateCustomer);

            return updateCustomer
                    + "\n is changed Successfully.";

        } catch (Exception e) {

            return "Customer update failed.";

        }

    }

    public String deleteCustomer(Integer id) {

        try {

            customerRepository.deleteById(id);

            return "Customer delete successfully.";

        } catch (Exception e) {

            return "Customer delete failed.";

        }
    }





}
