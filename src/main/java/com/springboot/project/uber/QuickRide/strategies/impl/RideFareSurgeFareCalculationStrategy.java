package com.springboot.project.uber.QuickRide.strategies.impl;

import com.springboot.project.uber.QuickRide.dto.RideRequestDto;
import com.springboot.project.uber.QuickRide.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgeFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
