package com.database.webshop.repositories;

import com.database.webshop.controller.CustomerController;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository("CustomerRepo")
public class CustomerRepoImpl implements CustomerRepo {

    Logger log = Logger.getLogger(CustomerRepoImpl.class.getName());
}
