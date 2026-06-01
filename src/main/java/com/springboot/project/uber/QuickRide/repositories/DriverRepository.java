package com.springboot.project.uber.QuickRide.repositories;

import com.springboot.project.uber.QuickRide.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {
}
