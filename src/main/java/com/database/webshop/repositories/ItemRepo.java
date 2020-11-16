package com.database.webshop.repositories;

import com.database.webshop.models.Items;
import com.database.webshop.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("ItemRepo")
public interface ItemRepo extends JpaRepository<Items, Long> {
}
