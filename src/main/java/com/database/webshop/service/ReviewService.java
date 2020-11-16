package com.database.webshop.service;

import com.database.webshop.models.Orders;
import com.database.webshop.models.Reviews;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReviewService")
public interface ReviewService {
    public List<Reviews> findAll();
}
