package com.database.webshop.repositories;

import com.database.webshop.models.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("CustomerRepo")
public interface CustomerRepo extends CrudRepository<Products, Long> {

    @Query(value = "{call get_product_list(:amount, :page_no)}", nativeQuery = true)
    public Iterable<Products> getProductList(@Param("amount") int amount, @Param("page_no") int page_no);

}
