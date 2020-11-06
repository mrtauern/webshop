package com.database.webshop.repositories;

import com.database.webshop.models.Products;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("ProductRepo")
public interface ProductRepo extends CrudRepository<Products, Long> {
    @Procedure(name = "getProductList")
    Iterable<Products> getProductList(@Param("amount") int amount,@Param("page_no") int page_no);
}
