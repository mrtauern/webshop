package com.database.webshop.controller;

import com.database.webshop.models.*;
import com.database.webshop.service.*;
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

    @Autowired
    private OrderService orderService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private ReviewService reviewService;

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

    @DeleteMapping("api/categories/{id}")
    public ResponseEntity<?> deleteCategoryById(@PathVariable Long id) {
        try {
            Categories exists = service.getCategoriesById(id);
            service.deleteCategoryById(exists.getID());
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("api/orders")
    public List<Orders> getOrders() {
        return orderService.findAll();
    }

    @GetMapping("api/orders/{id}")
    public ResponseEntity<Orders> getOrderById(@PathVariable Long id) {
        try {
            Orders order = orderService.getOrderById(id);
            return new ResponseEntity<>(order, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("api/orders")
    public void addOrders(@RequestBody Orders order) {
        orderService.saveOrder(order);
    }

    @PutMapping("api/orders/{id}")
    public ResponseEntity<?> updateOrderById(@RequestBody Orders order, @PathVariable Long id) {

        try {
            Orders existOrder = orderService.getOrderById(id);
            order.setID(existOrder.getID());
            orderService.saveOrder(order);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("api/orders/{id}")
    public ResponseEntity<?> deleteOrderById(@PathVariable Long id) {
        try {
            Orders exists = orderService.getOrderById(id);
            orderService.deleteOrderById(exists.getID());
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("api/items")
    public List<Items> getItems() {
        return itemService.findAll();
    }

    @GetMapping("api/items/{id}")
    public ResponseEntity<Items> getItemById(@PathVariable Long id) {
        try {
            Items item = itemService.getItemById(id);
            return new ResponseEntity<>(item, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("api/items")
    public void addItems(@RequestBody Items item) {
        itemService.saveItem(item);
    }

    @PutMapping("api/items/{id}")
    public ResponseEntity<?> updateItemById(@RequestBody Items item, @PathVariable Long id) {

        try {
            Items existItem = itemService.getItemById(id);
            item.setID(existItem.getID());
            itemService.saveItem(item);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("api/items/{id}")
    public ResponseEntity<?> deleteItemById(@PathVariable Long id) {
        try {
            Items exists = itemService.getItemById(id);
            itemService.deleteItemById(exists.getID());
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("api/reviews")
    public List<Reviews> getReviews() {
        return reviewService.findAll();
    }

    @GetMapping("api/reviews/{id}")
    public ResponseEntity<Reviews> getReviewById(@PathVariable Long id) {
        try {
            Reviews review = reviewService.getReviewById(id);
            return new ResponseEntity<>(review, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("api/reviews")
    public void addReview(@RequestBody Reviews review) {
        reviewService.saveReview(review);
    }

    @PutMapping("api/reviews/{id}")
    public ResponseEntity<?> updateReviewById(@RequestBody Reviews review, @PathVariable Long id) {

        try {
            Reviews existReview = reviewService.getReviewById(id);
            review.setID(existReview.getID());
            reviewService.saveReview(review);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("api/reviews/{id}")
    public ResponseEntity<?> deleteReviewById(@PathVariable Long id) {
        try {
            Reviews exists = reviewService.getReviewById(id);
            reviewService.deleteReviewById(exists.getID());
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
