package com.database.webshop.service;

import com.database.webshop.models.Categories;
import com.database.webshop.models.Product_options;
import com.database.webshop.models.Products;
import com.database.webshop.repositories.CategoriesRepo;
import com.database.webshop.repositories.CustomerRepo;
import com.database.webshop.repositories.Product_optionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

    Logger log = Logger.getLogger(CustomerServiceImpl.class.getName());

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    Product_optionsRepo product_optionsRepo;

    /*@Autowired
    ProductRepo productRepo;*/

    @Override
    public Iterable<Products> getProductList(int amount, int page_no) {
        return customerRepo.getProductList(amount, page_no);
    }

    @Override
    public Iterable<Product_options> findAll() {
        return product_optionsRepo.findAll();
    }
}
