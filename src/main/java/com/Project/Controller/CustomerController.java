package com.Project.Controller;

import com.Project.Entity.Customer;
import com.Project.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/addNewCustomer")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.addNewCustomer(customer);
    }
}
