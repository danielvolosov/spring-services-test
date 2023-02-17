package com.danielvolosov.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("api/v1/customers")
public class CustomerController {

    private CustomerService _customerService;

    public CustomerController(CustomerService customerService) {
        this._customerService = customerService;
    }
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest request) {
        log.info("New customer registration {}", request);
        _customerService.registerCustomer(request);
    }
}
