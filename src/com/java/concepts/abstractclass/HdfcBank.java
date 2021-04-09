package com.java.concepts.abstractclass;

public class HdfcBank extends Bank{
    @Override
    public void loan() {
        System.out.println("Overriden method loan");
    }
}
