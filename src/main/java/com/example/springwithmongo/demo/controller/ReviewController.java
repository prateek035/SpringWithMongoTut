package com.example.springwithmongo.demo.controller;

import com.example.springwithmongo.demo.models.Hotel;
import com.example.springwithmongo.demo.models.Review;
import com.example.springwithmongo.demo.service.HotelService;
import com.example.springwithmongo.demo.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class ReviewController {

    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {this.reviewService = reviewService;}

    @PutMapping("/review")
    public void insertReview(@RequestBody Review review) {
        reviewService.addReview(review);
    }

    @PostMapping("/review")
    public void updateReview(@RequestBody Review review) {
        reviewService.updateReview(review);
    }

    @DeleteMapping("review/id/{id}")
    public void deleteReview(@PathVariable("id") String id) {
        reviewService.deleteReview(id);
    }

    @GetMapping(path = "/{hotelId}/reviews", params = {"pageNo","size"})
    public List<Review> getAllReviewsByHotelId(@PathVariable("hotelId") String hotelId, @RequestParam("pageNo") int pageNo,
                                               @RequestParam("size") int size) {
        return reviewService.getReviewsByHotelId(hotelId, pageNo, size);
    }
}
