package com.pfa.service;

import com.pfa.entity.Customer;
import com.pfa.repository.CustomerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CustomerService {

    @Inject
    CustomerRepository customerRepository;

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll().list();
    }

    public void addCustomer(Customer customer){
        customerRepository.persist(customer);
    }
}
