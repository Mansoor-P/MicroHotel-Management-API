package com.mansoor.user.service.controller;


import com.mansoor.user.service.entities.User;
import com.mansoor.user.service.services.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    // create
    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    int retryCount = 1;

    // single user
    @GetMapping("/{userId}")
    //    @CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratingHotelFallback")
    //    @Retry(name = "ratingHotelService", fallbackMethod = "ratingHotelFallback")
    @RateLimiter(name = "userRateLimiter", fallbackMethod = "ratingHotelFallback")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
        User user = userService.getUser(userId);
        logger.info("Get Single User Handler: UserController");
        logger.info("Retry count: {}", retryCount);
        retryCount++;
        return ResponseEntity.ok(user);
    }


    // creating fall back method for circuitbreaker

    public ResponseEntity<User> ratingHotelFallback(String userId, Exception ex) {
        //        logger.info("Fallback is executed because service is down : " + ex.getMessage());

        User user = User.builder()
                .email("dummy@gmail.com")
                .name("dummy")
                .about("This user created dummy because some service is down")
                .userId("123456")
                .build();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // all user get
    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> allUser = userService.getAllUser();

        return ResponseEntity.ok(allUser);
    }

}
