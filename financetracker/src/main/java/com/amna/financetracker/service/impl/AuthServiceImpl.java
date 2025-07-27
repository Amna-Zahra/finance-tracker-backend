package com.amna.financetracker.service.impl;

import com.amna.financetracker.dto.RegisterDto;
import com.amna.financetracker.entity.User;
import com.amna.financetracker.repository.UserRepository;
import com.amna.financetracker.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String register(RegisterDto registerDto) {
        if (userRepository.existsByEmail(registerDto.getEmail())) {
            return "Email already exists!";
        }

        User user = new User();
        user.setName(registerDto.getName());
        user.setEmail(registerDto.getEmail());
        user.setPassword(registerDto.getPassword()); // In real projects, hash this!
        userRepository.save(user);

        return "User registered successfully";
    }
}
