package com.bealdung.constructorInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bealdung.model.Helm;

@Configuration
public class config {

    @Bean
    public Helm helm() {
        return new Helm();
    }
}
