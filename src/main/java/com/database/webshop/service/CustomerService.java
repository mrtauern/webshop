package com.database.webshop.service;

import com.database.webshop.models.Products;
import org.springframework.stereotype.Service;

@Service("CustomerService")
public interface CustomerService {
    Iterable<Products> getProductList(int amount, int page_no);
}
