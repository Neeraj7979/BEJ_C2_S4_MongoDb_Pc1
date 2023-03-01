package com.niit.bej.sampledemoformongodb.service;

import com.niit.bej.sampledemoformongodb.domain.Customer;
import com.niit.bej.sampledemoformongodb.repository.CustomerRepository;

public class CustmoerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustmoerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
