package com.Project.Service;

import com.Project.Entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer addNewCustomer(Customer customer);
    List<Customer> getAllCustomer();
}
