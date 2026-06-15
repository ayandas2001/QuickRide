package com.springboot.project.uber.QuickRide.strategies.impl;

import com.springboot.project.uber.QuickRide.dto.RideRequestDto;
import com.springboot.project.uber.QuickRide.entities.Driver;
import com.springboot.project.uber.QuickRide.entities.RideRequest;
import com.springboot.project.uber.QuickRide.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return null;
    }
}
