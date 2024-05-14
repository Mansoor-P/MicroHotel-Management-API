package com.mansoor.rating.services.impl;

import com.mansoor.rating.entities.Rating;
import com.mansoor.rating.repositories.RatingRepository;
import com.mansoor.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        // generate unique id

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getAllRatingsByHotel(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
