package com.springboot.project.uber.QuickRide.repositories;

import com.springboot.project.uber.QuickRide.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride,Long > {
}
