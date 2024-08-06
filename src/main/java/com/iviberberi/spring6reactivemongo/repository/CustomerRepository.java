package com.iviberberi.spring6reactivemongo.repository;

import com.iviberberi.spring6reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
