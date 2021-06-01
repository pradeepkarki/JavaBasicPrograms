package com.java.concepts.enums;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        //HttpStatus enum
        System.out.println(HttpStatus.CREATES.getStatusCode());
        System.out.println(HttpStatus.CREATES.getStatusMessage());
        System.out.println(HttpStatus.CREATES);

        //Direction enum
        System.out.println(Directions.EAST);
        System.out.println(Directions.valueOf("EAST"));
        System.out.println(Arrays.toString(Directions.values()));

    }
}
