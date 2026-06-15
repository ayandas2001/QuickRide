package com.springboot.project.uber.QuickRide.services.impl;

import com.springboot.project.uber.QuickRide.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {

        // TODO call the third party api to calculate the distance
        return 0;
    }
}
