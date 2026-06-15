package com.springboot.project.uber.QuickRide.services;

import com.springboot.project.uber.QuickRide.dto.DriverDto;
import com.springboot.project.uber.QuickRide.dto.SignupDto;
import com.springboot.project.uber.QuickRide.dto.UserDto;
import com.springboot.project.uber.QuickRide.entities.User;

public interface AuthService {
    String login(String email, String password);
    UserDto signup(SignupDto signupDto);
    DriverDto onboardNewDriver(Long userId);
}
