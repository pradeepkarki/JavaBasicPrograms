package com.java.concepts.streamapi.list;

import com.java.concepts.pojo.Car;

import java.util.Arrays;
import java.util.List;

/**
 *
 * None match if used to check if the provided condition is not matching in the list
 *
 *
 */
public class NoneMatchStream {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("bmw", 1, "black", 10),
                new Car("audi", 3, "black", 10),
                new Car("lambo", 4, "white", 12),
                new Car("bmw", 2, "white", 12)
        );

        System.out.println("Check if the list has non matching element given in the conditions");

        boolean b = cars.stream()
                .noneMatch(c -> c.getName().equals("maruti"));

        System.out.println("there is not any car name bmw-"+b);
    }
}
