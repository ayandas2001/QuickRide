package com.springboot.project.uber.QuickRide.services.impl;

import com.springboot.project.uber.QuickRide.dto.DriverDto;
import com.springboot.project.uber.QuickRide.dto.RideDto;
import com.springboot.project.uber.QuickRide.dto.RideRequestDto;
import com.springboot.project.uber.QuickRide.dto.RiderDto;
import com.springboot.project.uber.QuickRide.entities.RideRequest;
import com.springboot.project.uber.QuickRide.entities.Rider;
import com.springboot.project.uber.QuickRide.entities.User;
import com.springboot.project.uber.QuickRide.entities.enums.RideRequestStatus;
import com.springboot.project.uber.QuickRide.repositories.RideRequestRepository;
import com.springboot.project.uber.QuickRide.repositories.RiderRepository;
import com.springboot.project.uber.QuickRide.services.RiderService;
import com.springboot.project.uber.QuickRide.strategies.DriverMatchingStrategy;
import com.springboot.project.uber.QuickRide.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final RideRequestRepository rideRequestRepository;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RiderRepository riderRepository;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto,RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        rideRequestRepository.save(rideRequest);

        driverMatchingStrategy.findMatchingDriver(rideRequest);

        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRide() {
        return null;
    }

    @Override
    public Rider createRider(User user) {
        Rider rider = Rider.builder()
                .user(user)
                .rating(0.0)
                .build();

        return riderRepository.save(rider);
    }
}
