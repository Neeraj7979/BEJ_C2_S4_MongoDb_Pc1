package com.niit.bej.sampledemoformongodb.service;

import com.niit.bej.sampledemoformongodb.domain.Customer;
import com.niit.bej.sampledemoformongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustmoerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustmoerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        if (customerRepository.findById(customer.getCustID()).isPresent())
            return null;
        else
            return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerId(Integer id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent())
            return customerOptional.get();
        else
            return null;
    }
}
