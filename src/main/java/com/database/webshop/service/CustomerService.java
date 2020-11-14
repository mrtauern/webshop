package com.database.webshop.service;

import com.database.webshop.models.Categories;
import com.database.webshop.models.Product_options;
import com.database.webshop.models.Products;
import org.springframework.stereotype.Service;

@Service("CustomerService")
public interface CustomerService {
    Iterable<Products> getProductList(int amount, int page_no);

    public Iterable<Product_options> findAll();
}
