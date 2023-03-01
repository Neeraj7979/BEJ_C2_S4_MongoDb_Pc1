package com.niit.bej.sampledemoformongodb.service;

import com.niit.bej.sampledemoformongodb.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer addCustomer(Customer customer);

    List<Customer> getCustomer();

    Customer getCustomerId(Integer id);

    Customer getCustomerByEmail(String emailid);
}
