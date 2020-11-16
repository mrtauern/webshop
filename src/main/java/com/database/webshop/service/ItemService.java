package com.database.webshop.service;

import com.database.webshop.models.Items;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ItemService")
public interface ItemService {
    public List<Items> findAll();
}
