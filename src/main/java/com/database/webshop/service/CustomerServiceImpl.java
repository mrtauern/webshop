package com.database.webshop.service;

import com.database.webshop.controller.CustomerController;
import com.database.webshop.models.Products;
import com.database.webshop.repositories.CustomerRepo;
import com.database.webshop.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

    Logger log = Logger.getLogger(CustomerServiceImpl.class.getName());

    @Autowired
    CustomerRepo customerRepo;

    /*@Autowired
    ProductRepo productRepo;*/

    @Override
    public Iterable<Products> getProductList(int amount, int page_no) {
        return customerRepo.getProductList(amount, page_no);
    }
}
