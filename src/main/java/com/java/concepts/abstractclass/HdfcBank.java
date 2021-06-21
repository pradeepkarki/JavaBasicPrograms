package com.java.concepts.abstractclass;

public class HdfcBank extends Bank{
    @Override
    public void loan() {
        System.out.println("Overriden method loan");
    }

    public void employeesSalary() {
        System.out.println("salary of each employees");
    }
}
