package com.amna.financetracker.controller;

import com.amna.financetracker.dto.RegisterDto;
import com.amna.financetracker.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String registerUser(@RequestBody RegisterDto registerDto) {
        return authService.register(registerDto);
    }
}
