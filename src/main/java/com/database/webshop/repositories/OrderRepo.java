package com.database.webshop.repositories;

import com.database.webshop.models.Orders;
import com.database.webshop.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("OrderRepo")
public interface OrderRepo extends JpaRepository<Orders, Long> {

    @Query(value = "{call get_order_history_for_user(:user_id)}", nativeQuery = true)
    public Iterable<Orders> getProductList(@Param("user_id") int user_id);

}
