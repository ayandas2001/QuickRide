package com.springboot.project.uber.QuickRide.repositories;

import com.springboot.project.uber.QuickRide.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider,Long> {
}
