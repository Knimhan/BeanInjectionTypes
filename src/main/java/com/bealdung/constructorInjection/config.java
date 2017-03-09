package com.bealdung.constructorInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public Helm helm() {
        return new Helm();
    }
}
