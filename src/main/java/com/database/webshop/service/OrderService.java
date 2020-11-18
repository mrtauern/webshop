package com.database.webshop.service;

import com.database.webshop.models.Categories;
import com.database.webshop.models.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrderService")
public interface OrderService {

    public List<Orders> findAll();

    public Orders getOrderById(Long id);
    public void addOrder(Orders order);
    public void saveOrder(Orders order);
    public void deleteOrderById(Long id);

}
