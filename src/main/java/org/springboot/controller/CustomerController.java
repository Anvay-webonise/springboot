package org.springboot.controller;

import org.springboot.domain.Customer;
import org.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> createMessage(Customer customer) {
        customerRepository.save(customer);
        return new ResponseEntity<String>("Successfully added", HttpStatus.OK);
    }
}
