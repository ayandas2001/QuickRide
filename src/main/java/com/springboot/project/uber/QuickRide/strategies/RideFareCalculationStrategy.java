package com.springboot.project.uber.QuickRide.strategies;

import com.springboot.project.uber.QuickRide.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
