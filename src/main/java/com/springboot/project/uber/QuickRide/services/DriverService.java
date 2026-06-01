package com.springboot.project.uber.QuickRide.services;

import com.springboot.project.uber.QuickRide.dto.DriverDto;
import com.springboot.project.uber.QuickRide.dto.RideDto;
import com.springboot.project.uber.QuickRide.dto.RideRequestDto;
import com.springboot.project.uber.QuickRide.dto.RiderDto;

import java.util.List;

public interface DriverService {
    RideRequestDto acceptRide(Long rideRequestId);
   RideDto cancelRide(Long rideId);
   RideDto startRide(Long rideId);
   RideDto endRide(Long rideId);
   RiderDto rateRider(Long rideId, Integer rating);
   DriverDto getMyProfile();
   List<RideDto> getAllMyRide();
}
