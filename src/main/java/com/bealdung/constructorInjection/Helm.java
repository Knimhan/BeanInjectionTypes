package com.bealdung.constructorInjection;

public class Helm {
    private String message = "helm message";

    public Helm() {
        System.out.println("Helm constructor called");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
