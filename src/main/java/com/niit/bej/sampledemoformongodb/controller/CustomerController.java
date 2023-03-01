package com.niit.bej.sampledemoformongodb.controller;

import com.niit.bej.sampledemoformongodb.domain.Customer;
import com.niit.bej.sampledemoformongodb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addcustomer")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
        Customer insertedcustomer = customerService.addCustomer(customer);
        if (insertedcustomer != null)
            return new ResponseEntity<>(insertedcustomer, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

    @GetMapping("/getcustomers")
    public ResponseEntity<?> getCustomer() {
        List<Customer> customerList = customerService.getCustomer();
        if (customerList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(customerList, HttpStatus.FOUND);
    }

    @GetMapping("/getcustomer/{id}")
    public ResponseEntity<?> getOneCustomer(@PathVariable Integer id) {
        Customer fetchedCustomer = customerService.getCustomerId(id);
        if (fetchedCustomer == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(fetchedCustomer, HttpStatus.FOUND);
    }

    @GetMapping("/getcustomerbyemail/{emailid}")
    public ResponseEntity<?> getOneCustomerByEmail(@PathVariable String emailid) {
        Customer fetchedCustomer = customerService.getCustomerByEmail(emailid);
        if (fetchedCustomer == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(fetchedCustomer, HttpStatus.FOUND);
    }
}
