package com.niit.bej.sampledemoformongodb.repository;

import com.niit.bej.sampledemoformongodb.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    Optional<Customer> findByCustEmailId(String custEmailId);

    @Query("{'custAddress.city':?0}")
//db.customer.find({"custAddress.city":?})
    List<Customer> findByCustomerCity(String city);

    @Query("{'custAddress.city':?1,custType:?0}")
    List<Customer> findByCustomerCityAndType(String type, String city);
}
