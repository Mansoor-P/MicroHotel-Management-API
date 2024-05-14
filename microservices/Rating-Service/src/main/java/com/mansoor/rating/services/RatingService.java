package com.mansoor.rating.services;

import com.mansoor.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating create(Rating rating);

    List<Rating> getAllRatings();

    List<Rating> getAllRatingsByUserId(String userId);

    List<Rating> getAllRatingsByHotel(String hotelId);
}
