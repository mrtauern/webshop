package com.database.webshop.service;

import com.database.webshop.controller.CustomerController;
import com.database.webshop.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

    Logger log = Logger.getLogger(CustomerServiceImpl.class.getName());

    @Autowired
    CustomerRepo customerRepo;
}
