package com.amna.financetracker.service;

import com.amna.financetracker.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
}
