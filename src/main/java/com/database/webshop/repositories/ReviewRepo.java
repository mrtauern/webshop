package com.database.webshop.repositories;

import com.database.webshop.models.Orders;
import com.database.webshop.models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ReviewRepo")
public interface ReviewRepo extends JpaRepository<Reviews, Long> {
}
