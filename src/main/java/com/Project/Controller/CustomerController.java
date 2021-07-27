package com.Project.Controller;

import com.Project.Entity.Customer;
import com.Project.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/addNewCustomer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.addNewCustomer(customer);
    }

    @GetMapping("/getAllCustomer")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }
}
