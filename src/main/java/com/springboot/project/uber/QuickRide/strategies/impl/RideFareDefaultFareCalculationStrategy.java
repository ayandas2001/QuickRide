package com.springboot.project.uber.QuickRide.strategies.impl;

import com.springboot.project.uber.QuickRide.dto.RideRequestDto;
import com.springboot.project.uber.QuickRide.entities.RideRequest;
import com.springboot.project.uber.QuickRide.services.DistanceService;
import com.springboot.project.uber.QuickRide.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Primary
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
      double distance =  distanceService.calculateDistance(rideRequest.getPickupLocation(),rideRequest.getDropOffLocation());
      return distance*RIDE_FARE_MULTIPLIER;
    }
}
