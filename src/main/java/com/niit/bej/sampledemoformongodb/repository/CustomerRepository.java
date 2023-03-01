package com.niit.bej.sampledemoformongodb.repository;

import com.niit.bej.sampledemoformongodb.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    Optional<Customer> findByCustEmailId(String custEmailId);
}
