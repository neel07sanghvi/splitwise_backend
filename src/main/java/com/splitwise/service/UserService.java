package com.splitwise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.splitwise.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // public User registerUser(UserDto userDto)
    // {
    // User user = new User();
    // user.setEmail(userDto.getEmail());
    // }
}
