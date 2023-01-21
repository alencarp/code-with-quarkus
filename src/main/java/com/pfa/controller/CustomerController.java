package com.pfa.controller;

import com.pfa.entity.Customer;
import com.pfa.service.CustomerService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/api/customer")
public class CustomerController {
    @Inject
    CustomerService customerService;

    @GET
    public List<Customer> trazerCustomers(){
        List<Customer> listaClientes = new ArrayList<>();
        try{
            listaClientes = customerService.findAllCustomers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaClientes;
    }

    @POST
    @Transactional
    public void salvarCustomers(Customer customer) {
        customerService.addCustomer(customer);

    }


}
