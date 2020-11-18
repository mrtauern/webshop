package com.database.webshop.service;

import com.database.webshop.models.Categories;
import com.database.webshop.models.Products;
import com.database.webshop.repositories.CategoriesRepo;
import com.database.webshop.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service("ApiService")
public class ApiServiceImpl implements ApiService {

    Logger log = Logger.getLogger(ApiService.class.getName());

    @Qualifier(value = "ProductRepo")
    @Autowired
    private ProductRepo productRepo;

    @Qualifier(value = "CategoriesRepo")
    @Autowired
    private CategoriesRepo categoriesRepo;

    public List<Products> listAll() {
        return productRepo.findAll();
    }

    public void save(Products products) {
        productRepo.save(products);
    }

    public Products getProductById(Long id) {
        return productRepo.findById(id).get();
    }

    public void deleteProductById(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Categories> getCategories() {
        return categoriesRepo.findAll();
    }

    @Override
    public Categories getCategoriesById(Long id) {
        return categoriesRepo.findById(id).get();
    }

    @Override
    public void addCategory(Categories category) {
        categoriesRepo.save(category);
    }

    @Override
    public void saveCategory(Categories category) {
        categoriesRepo.save(category);
    }

    public void deleteCategoryById(Long id) {
        categoriesRepo.deleteById(id);
    }


}
