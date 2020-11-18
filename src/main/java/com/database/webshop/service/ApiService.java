package com.database.webshop.service;

import com.database.webshop.models.Categories;
import com.database.webshop.models.Products;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service("ApiService")
public interface ApiService {
    public List<Products> listAll();

    public void save(Products products);

    public Products getProductById(Long id);

    public void deleteProductById(Long id);

    public List<Categories> getCategories();

    public Categories getCategoriesById(Long id);
    public void addCategory(Categories category);
    public void saveCategory(Categories category);

    public void deleteCategoryById(Long id);
}
