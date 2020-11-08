package com.database.webshop.service;

import com.database.webshop.models.Products;
import com.database.webshop.repositories.ApiRepo;
import com.database.webshop.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service("ApiService")
public class ApiServiceImpl implements ApiService {

    Logger log = Logger.getLogger(ApiService.class.getName());

    //@Qualifier(value = "ApiRepo")
    @Autowired
    private ApiRepo apirepo;

    public List<Products> listAll() {
        return apirepo.findAll();
    }

    public void save(Products products) {
        apirepo.save(products);
    }

    public Products getProductById(Long id) {
        return apirepo.findById(id).get();
    }

    public void deleteProductById(Long id) {
        apirepo.deleteById(id);
    }

}
