package com.niit.bej.sampledemoformongodb.repository;

import com.niit.bej.sampledemoformongodb.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
}
