package com.springboot.project.uber.QuickRide.strategies;

import com.springboot.project.uber.QuickRide.dto.RideRequestDto;
import com.springboot.project.uber.QuickRide.entities.Driver;
import com.springboot.project.uber.QuickRide.entities.RideRequest;
import com.springboot.project.uber.QuickRide.repositories.DriverRepository;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
