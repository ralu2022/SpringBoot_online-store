package com.example.flowershop.service;

import com.example.flowershop.model.Review;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {
    List<Review> reviewList = new ArrayList<>();

    public List<Review> getAllReviews() {
        List<Review> reviewList = new ArrayList<>();

        Review review1 = Review.builder()
                .userName("user1")
                .id(1)
                .date(LocalDate.now())
                .reviewMsg("good product")
                .build();
        Review review2 = Review.builder()
                .userName("user2")
                .id(2)
                .date(LocalDate.now())
                .reviewMsg("product just fine")
                .build();
        reviewList.add(review1);
        reviewList.add(review2);
        return reviewList;
    }
}
