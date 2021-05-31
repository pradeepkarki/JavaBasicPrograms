package com.java.concepts.interfaceconcept;

public interface Car1 {

    public void drive();
    public void colour();
    public void mileage();

    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}
