package com.mansoor.user.service.external.services;

import com.mansoor.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Map;
import java.util.Objects;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
    //

    //POST
    @PostMapping("/ratings")
    public ResponseEntity<Rating> createRating(Rating values);

    // PUT
    @PutMapping("/ratings/{ratingId}")
    public ResponseEntity<Rating> updateRating(@PathVariable("ratingId") String ratingId, Rating rating);


    @DeleteMapping("/ratings/{ratingId}")
    public  void deleteRating(@PathVariable  String ratingId);
}
