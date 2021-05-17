package com.java.concepts.singletonconcept;

public class Singleton {

    /*
    declaring the instance variable as null
     */
    private static Singleton singletonInstance = null;

    /*
    Private Constructor to prevent the initialisation of the class
     */
    private Singleton() {
    }

    /*
    Creating the class instance only once
     */
    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
