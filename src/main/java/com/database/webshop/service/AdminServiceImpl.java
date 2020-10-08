package com.database.webshop.service;

import com.database.webshop.controller.CustomerController;
import com.database.webshop.repositories.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    Logger log = Logger.getLogger(AdminServiceImpl.class.getName());

    @Autowired
    AdminRepo adminRepo;
}
