package com.database.webshop.repositories;

import com.database.webshop.controller.CustomerController;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository("AdminRepo")
public class AdminRepoImpl implements AdminRepo {

    Logger log = Logger.getLogger(AdminRepoImpl.class.getName());
}
