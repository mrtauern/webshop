package com.database.webshop.controller;

import com.database.webshop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;

@Controller
public class AdminController {

    public AdminController(){

    }

    Logger log = Logger.getLogger(AdminController.class.getName());

    @Autowired
    AdminService adminService;
}
