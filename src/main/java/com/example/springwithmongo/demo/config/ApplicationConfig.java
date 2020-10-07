package com.example.springwithmongo.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
public class ApplicationConfig {


    @Bean
    public ModelMapper initConfig() {
        return new ModelMapper();
    }

}
