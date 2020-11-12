package com.database.webshop.repositories;

import com.database.webshop.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CategoriesRepo")
public interface CategoriesRepo extends JpaRepository<Categories, Long> {
}
