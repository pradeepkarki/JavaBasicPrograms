package com.java.concepts.abstractclass;

public abstract class Bank {

    //static final and non-static
    int amt=100;
    final int rate=100;
    static int loan = 200;

    //abstract method no body

    public abstract void loan();

    public void credit(){
        System.out.println("Credit method");
    }

    public void debit(){
        System.out.println("Debit method");
    }
}
