package com.springboot.project.uber.QuickRide.repositories;

import com.springboot.project.uber.QuickRide.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest,Long> {
}
