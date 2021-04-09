package com.java.concepts.inheritance;

public class MainClass {
    public static void main(String[] args) {

        //Static polymorphism - compile time
        Duke d = new Duke();
        d.type();
        d.color();
        d.seater();

        //run time polymorphism
        //dynamic poly
        //Parent reference child object
        //Can only run over ridden method and parent method
        Bike b = new Duke();
        b.type();
        b.seater();

        //down casting - ClassCastException
        //Duke d1= (Duke)new Bike();
    }
}
