package com.springboot.project.uber.QuickRide.services;

import com.springboot.project.uber.QuickRide.dto.RideRequestDto;
import com.springboot.project.uber.QuickRide.entities.Driver;
import com.springboot.project.uber.QuickRide.entities.Ride;
import com.springboot.project.uber.QuickRide.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
    Ride getRideById(Long rideId);
    void matchWithDrivers(RideRequestDto rideRequestDto);
    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);
    Ride updateRideStatus(Long rideId, RideStatus rideStatus);
    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);
    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
