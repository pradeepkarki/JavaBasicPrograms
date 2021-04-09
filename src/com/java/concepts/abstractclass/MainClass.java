package com.java.concepts.abstractclass;

public class MainClass {
    public static void main(String[] args) {

        //partial implementation
        //Abstraction concept - hidding the implementation logic


        HdfcBank hdfcBan= new HdfcBank();
        hdfcBan.loan();
        hdfcBan.credit();
        hdfcBan.debit();


        //

        Bank b= new HdfcBank();
        b.loan();
        b.credit();
        b.debit();

        //U cant create the object of abstract class
        //Bank b= ne Bank();


    }
}
