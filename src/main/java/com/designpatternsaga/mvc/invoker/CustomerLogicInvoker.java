package com.designpatternsaga.mvc.invoker;

import com.designpatternsaga.mvc.dao.CustomerDao;
import com.designpatternsaga.mvc.dto.CustomerDTO;
import com.designpatternsaga.mvc.resources.CustomerResource;
import com.designpatternsaga.mvc.services.CustomerService;

public class CustomerLogicInvoker {

    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        CustomerService customerService = new CustomerService(customerDao);
        CustomerResource customerResource = new CustomerResource(customerService);

        CustomerDTO emptyCustomerDTO = customerResource.findById(-1);
        if (emptyCustomerDTO.getName() == null) {
            System.out.println("Success! '" + emptyCustomerDTO.getName() + "'");
        }

        CustomerDTO filledCustomerDTO = customerResource.findById(1);
        if (filledCustomerDTO.getName().equals("Challenger")) {
            System.out.println("Success! " + filledCustomerDTO.getName());
        }
    }

}
