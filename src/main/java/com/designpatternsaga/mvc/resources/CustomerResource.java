package com.designpatternsaga.mvc.resources;

import com.designpatternsaga.mvc.dto.CustomerDTO;
import com.designpatternsaga.mvc.model.Customer;
import com.designpatternsaga.mvc.services.CustomerService;

public class CustomerResource {

    private CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerDTO findById(long customerId) {
        Customer customer = customerService.findById(customerId);
        return CustomerDTO.toCustomerDTO(customer);
    }
}
