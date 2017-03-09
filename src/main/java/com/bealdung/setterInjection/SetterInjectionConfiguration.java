package com.bealdung.setterInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bealdung.model.Helm;
import com.bealdung.model.Ship;

@Configuration
public class SetterInjectionConfiguration {

    @Bean
    public Ship ship() {
        System.out.println("Setter injection ship bean creation");
        return new Ship();
    }

    @Bean
    public Helm helm() {
        System.out.println("Setter injection helm bean creation");
        return new Helm();
    }
}
