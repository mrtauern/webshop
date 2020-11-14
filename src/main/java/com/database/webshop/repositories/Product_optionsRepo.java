package com.database.webshop.repositories;

import com.database.webshop.models.Categories;
import com.database.webshop.models.Product_options;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_optionsRepo extends JpaRepository<Product_options, Long> {
}
