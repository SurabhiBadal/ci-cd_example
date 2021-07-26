package com.Project.Repository;

import com.Project.Entity.Customer;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void canGetCustomerByUsernameIfUserExists() {
        Customer customer = new Customer(1L, "Badal", "ba@ba.com", "1234");
        customerRepository.save(customer);
        Customer customerByUsername = customerRepository.findByEmail("ba@ba.com");
        assertEquals(customer.getId(),customerByUsername.getId());
    }


}
