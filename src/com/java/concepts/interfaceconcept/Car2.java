package com.java.concepts.interfaceconcept;

public interface Car2 {

    public void price();

    // default method
    default void show() {
        System.out.println("Default Method Executed");
    }
}
