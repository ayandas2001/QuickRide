package com.springboot.project.uber.QuickRide.entities;

import com.springboot.project.uber.QuickRide.entities.enums.PaymentMethod;
import com.springboot.project.uber.QuickRide.entities.enums.RideRequestStatus;
import com.springboot.project.uber.QuickRide.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point dropOffLocation;

    private LocalDateTime createdAt;

    @ManyToOne
    private Rider rider;

    @ManyToOne
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private String otp;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
