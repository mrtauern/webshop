package com.database.webshop.service;

import com.database.webshop.models.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrderService")
public interface OrderService {

    public List<Orders> findAll();
}
