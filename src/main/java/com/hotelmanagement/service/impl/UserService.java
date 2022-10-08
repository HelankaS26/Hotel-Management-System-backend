package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.UserRepository;
import com.hotelmanagement.service.UserServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceable {

    @Autowired
    private UserRepository userRepository;
}
