package com.database.webshop.controller;

import com.database.webshop.models.Categories;
import com.database.webshop.models.Product_options;
import com.database.webshop.models.Products;
import com.database.webshop.service.ApiService;
import com.database.webshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ApiController {

    @Autowired
    private ApiService service;

    @Autowired
    private CustomerService customerService;

    @GetMapping("api/products")
    public Iterable<Products> listProducts() {
        return service.listAll();
    }

    @GetMapping("api/products/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable Long id) {
        try {
            Products products = service.getProductById(id);
            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("api/products")
    public void addProduct(@RequestBody Products products) {
        service.save(products);
    }

    @PutMapping("api/products/{id}")
    public ResponseEntity<?> updateProductById(@RequestBody Products products, @PathVariable Long id) {

        try {
            Products existProducts = service.getProductById(id);
            products.setID(existProducts.getID());
            service.save(products);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("api/products/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable Long id) {
        try {
            Products existProducts = service.getProductById(id);
            service.deleteProductById(existProducts.getID());
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("api/categories")
    public Iterable<Categories> getCategories() {
        return service.getCategories();
    }

    @GetMapping("api/product_options")
    public Iterable<Product_options> listProduct_options() {
        return customerService.findAll();
    }

    @GetMapping("api/categories/{id}")
    public ResponseEntity<Categories> getCategoriesById(@PathVariable Long id) {
        try {
            Categories categories = service.getCategoriesById(id);
            return new ResponseEntity<>(categories, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("api/categories")
    public void addCategory(@RequestBody Categories category) {
        service.saveCategory(category);
    }

    @PutMapping("api/categories/{id}")
    public ResponseEntity<?> updateCategoryById(@RequestBody Categories category, @PathVariable Long id) {

        try {
            Categories existCategory = service.getCategoriesById(id);
            category.setID(existCategory.getID());
            service.saveCategory(category);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
