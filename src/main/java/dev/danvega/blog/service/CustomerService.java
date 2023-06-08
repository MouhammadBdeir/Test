package dev.danvega.blog.service;

import java.util.List;

import dev.danvega.blog.model.Customer;
import dev.danvega.blog.repository.CustomerRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private  CustomerRepository customerRepository;


    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    public Customer getCustomerById(Long id) throws NotFoundException {
        return customerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Customer not found with id: " + id));
    }
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
    public void updateFeedback(Long id, Customer customer) throws Exception{
        Customer customer1 = customerRepository.findById(id)
                .orElseThrow(() -> new Exception("Customer not found with id: " + id));
        customerRepository.save(customer1);
    }
}