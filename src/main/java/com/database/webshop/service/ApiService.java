package com.database.webshop.service;

import com.database.webshop.models.Categories;
import com.database.webshop.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ApiService")
public interface ApiService {
    public List<Products> listAll();

    public void save(Products products);

    public Products getProductById(Long id);

    public void deleteProductById(Long id);

    public List<Categories> getCategories();
}
