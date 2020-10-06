package com.example.springwithmongo.demo.service;

import com.example.springwithmongo.demo.models.Hotel;
import com.example.springwithmongo.demo.models.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    void addReview(Review review);

    void updateReview(Review review);

    List<Review> getReviewsByHotelId(String hotelId, int pageNo, int size);

    void deleteReview(String id);

}
