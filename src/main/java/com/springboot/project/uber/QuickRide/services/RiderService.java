package com.springboot.project.uber.QuickRide.services;

import com.springboot.project.uber.QuickRide.dto.DriverDto;
import com.springboot.project.uber.QuickRide.dto.RideDto;
import com.springboot.project.uber.QuickRide.dto.RideRequestDto;
import com.springboot.project.uber.QuickRide.dto.RiderDto;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);
    RideDto cancelRide(Long rideId);
    DriverDto rateDriver(Long rideId, Integer rating);
    RiderDto getMyProfile();
    List<RideDto> getAllMyRide();
}
