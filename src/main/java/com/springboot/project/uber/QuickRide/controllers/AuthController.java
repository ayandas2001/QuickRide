package com.springboot.project.uber.QuickRide.controllers;

import com.springboot.project.uber.QuickRide.dto.SignupDto;
import com.springboot.project.uber.QuickRide.dto.UserDto;
import com.springboot.project.uber.QuickRide.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public UserDto signup(@RequestBody SignupDto signupDto){
        return authService.signup(signupDto);
    }
}
