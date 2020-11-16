package com.database.webshop.repositories;

import com.database.webshop.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductRepo")
public interface ProductRepo extends JpaRepository<Products, Long> {
}
