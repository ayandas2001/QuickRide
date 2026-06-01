package com.springboot.project.uber.QuickRide.strategies;

import com.springboot.project.uber.QuickRide.dto.RideRequestDto;
import com.springboot.project.uber.QuickRide.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
