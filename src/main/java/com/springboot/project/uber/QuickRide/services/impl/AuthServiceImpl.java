package com.springboot.project.uber.QuickRide.services.impl;

import com.springboot.project.uber.QuickRide.dto.DriverDto;
import com.springboot.project.uber.QuickRide.dto.SignupDto;
import com.springboot.project.uber.QuickRide.dto.UserDto;
import com.springboot.project.uber.QuickRide.entities.User;
import com.springboot.project.uber.QuickRide.entities.enums.Role;
import com.springboot.project.uber.QuickRide.exceptions.RuntimeConflictException;
import com.springboot.project.uber.QuickRide.repositories.UserRepository;
import com.springboot.project.uber.QuickRide.services.AuthService;
import com.springboot.project.uber.QuickRide.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;
    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if(user != null){
            throw new RuntimeConflictException("Cannot Signup, User already exist with email "+signupDto.getEmail());
        }

        User mappedUser = modelMapper.map(signupDto,User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);

        // create Rider Profile
        riderService.createRider(savedUser);

        // create wallet related stuff TODO

        return modelMapper.map(savedUser,UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
