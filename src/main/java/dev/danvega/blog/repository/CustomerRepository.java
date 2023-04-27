package dev.danvega.blog.repository;

import dev.danvega.blog.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// DAO class
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
