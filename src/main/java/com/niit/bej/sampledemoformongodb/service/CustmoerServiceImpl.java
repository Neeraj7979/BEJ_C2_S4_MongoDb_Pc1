package com.niit.bej.sampledemoformongodb.service;

import com.niit.bej.sampledemoformongodb.domain.Customer;
import com.niit.bej.sampledemoformongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustmoerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustmoerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
