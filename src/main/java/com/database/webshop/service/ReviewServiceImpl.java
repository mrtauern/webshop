package com.database.webshop.service;

import com.database.webshop.models.Orders;
import com.database.webshop.models.Reviews;
import com.database.webshop.repositories.OrderRepo;
import com.database.webshop.repositories.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReviewService")
public class ReviewServiceImpl implements ReviewService {

    @Qualifier(value = "ReviewRepo")
    @Autowired
    private ReviewRepo reviewRepo;

    public List<Reviews> findAll() {
        return reviewRepo.findAll();
    }

    @Override
    public Reviews getReviewById(Long id) {
        return reviewRepo.findById(id).get();
    }

    @Override
    public void addReview(Reviews review) {
        reviewRepo.save(review);
    }

    @Override
    public void saveReview(Reviews review) {
        reviewRepo.save(review);
    }

    @Override
    public void deleteReviewById(Long id) {
        reviewRepo.deleteById(id);
    }
}
