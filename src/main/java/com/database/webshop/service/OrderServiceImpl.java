package com.database.webshop.service;

import com.database.webshop.models.Categories;
import com.database.webshop.models.Orders;
import com.database.webshop.models.Products;
import com.database.webshop.repositories.OrderRepo;
import com.database.webshop.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {

    @Qualifier(value = "OrderRepo")
    @Autowired
    private OrderRepo orderRepo;

    public List<Orders> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public Orders getOrderById(Long id) {
        return orderRepo.findById(id).get();
    }

    @Override
    public void addOrder(Orders order) {
        orderRepo.save(order);
    }

    @Override
    public void saveOrder(Orders order) {
        orderRepo.save(order);
    }

    @Override
    public void deleteOrderById(Long id) {
        orderRepo.deleteById(id);
    }

}
