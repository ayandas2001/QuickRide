package com.springboot.project.uber.QuickRide.configs;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.utility.nullability.MaybeNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mapper {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
