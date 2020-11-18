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

    @Override
    public Items getItemById(Long id) {
        return itemRepo.findById(id).get();
    }

    @Override
    public void addItem(Items item) {
        itemRepo.save(item);
    }

    @Override
    public void saveItem(Items item) {
        itemRepo.save(item);
    }

    public void deleteItemById(Long id) {
        itemRepo.deleteById(id);
    }
}
