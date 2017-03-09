package com.bealdung.constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ship {

    private Helm helm;

    @Autowired
    public Ship(Helm helm) {
        this.helm = helm;
        System.out.println("Ship constructor called  " + this.helm.getMessage());
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }
}
