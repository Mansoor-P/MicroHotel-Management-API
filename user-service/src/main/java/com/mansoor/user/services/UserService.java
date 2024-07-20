package com.mansoor.user.services;


import com.mansoor.user.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);

}