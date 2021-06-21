package com.java.concepts.singletonconcept;

/**
 * steps to create singleton class
 * 1.Create private constructor
 * 2.Create public static method
 * 3.private static class obj
 *
 */
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
