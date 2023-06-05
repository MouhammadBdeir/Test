package dev.danvega.blog.repository;


import dev.danvega.blog.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    // additional methods can be defined here
}

