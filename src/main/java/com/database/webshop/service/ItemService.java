package com.database.webshop.service;

import com.database.webshop.models.Items;
import com.database.webshop.models.Orders;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ItemService")
public interface ItemService {
    public List<Items> findAll();

    public Items getItemById(Long id);
    public void addItem(Items item);
    public void saveItem(Items item);
    public void deleteItemById(Long id);
}
