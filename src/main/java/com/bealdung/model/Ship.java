package com.bealdung.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ship {

    private Helm helm;

    public Ship() {
        System.out.println("Ship default constructor called  ");
    }

    @Autowired
    public Ship(Helm helm) {
        this.helm = helm;
        System.out.println("Ship constructor called  " + this.helm.getMessage());
    }

    public Helm getHelm() {
        return helm;
    }

    @Autowired
    public void setHelm(Helm helm) {
        this.helm = helm;
        System.out.println("Ship set helm method called  " + this.helm.getMessage());
    }
}
