package com.java.concepts.interfaceconcept;

public class BMW implements Car1,Car2 {
    @Override
    public void drive() {
        System.out.println("4 wheeler drive");
    }

    @Override
    public void colour() {
        System.out.println("Black");
    }

    @Override
    public void mileage() {
        System.out.println("10 km");
    }

    @Override
    public void show() {

    }

    @Override
    public void price() {

    }
}
