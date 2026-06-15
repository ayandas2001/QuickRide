package com.springboot.project.uber.QuickRide.configs;

import com.springboot.project.uber.QuickRide.dto.PointDto;
import com.springboot.project.uber.QuickRide.utils.GeometryUtil;
import jakarta.websocket.PongMessage;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mapper {

    @Bean
    public ModelMapper getModelMapper(){
        ModelMapper mapper =  new ModelMapper();

        mapper.typeMap(PointDto.class, Point.class).setConverter(context ->{
            PointDto pointDto = context.getSource();
            return GeometryUtil.createPoint(pointDto);
        });

        mapper.typeMap(Point.class,PointDto.class).setConverter(context ->{
            Point point = context.getSource();
            double[] coordinates = {
                    point.getX(),
                    point.getY()
            };
            return new PointDto(coordinates);
        });

        return mapper;
    }
}
