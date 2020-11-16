package com.database.webshop.service;

import com.database.webshop.models.Items;
import com.database.webshop.models.Orders;
import com.database.webshop.repositories.ItemRepo;
import com.database.webshop.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ItemService")
public class ItemServiceImpl implements ItemService {

    @Qualifier(value = "ItemRepo")
    @Autowired
    private ItemRepo itemRepo;

    public List<Items> findAll() {
        return itemRepo.findAll();
    }
}
