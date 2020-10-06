package com.example.springwithmongo.demo.service;

import com.example.springwithmongo.demo.models.Review;
import com.example.springwithmongo.demo.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public void addReview(Review review) {
        reviewRepository.insert(review);
    }

    @Override
    public void updateReview(Review review) {
        reviewRepository.save(review);
    }

    @Override
    public List<Review> getReviewsByHotelId(String hotelId, int pageNo, int size) {
        try {
            return reviewRepository.findByHotelId(hotelId,  PageRequest.of(pageNo, size)).getContent();
        }catch(IllegalArgumentException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void deleteReview(String id) {
        reviewRepository.deleteById(id);
    }
}
