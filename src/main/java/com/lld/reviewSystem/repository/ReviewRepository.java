package com.lld.reviewSystem.repository;

import com.lld.reviewSystem.review.Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReviewRepository {
    public static List<Review> reviews = new ArrayList<>();
    public static Map<Long, Review> reviewMap = new HashMap<>();
}
