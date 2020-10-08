package com.database.webshop.controller;

import com.database.webshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class CustomerController {
    public CustomerController(){

    }

    Logger log = Logger.getLogger(CustomerController.class.getName());

    @Autowired
    CustomerService customerService;

    @GetMapping()
    public String index(Model model){
        log.info("index called");

        return "index";
    }
}
