package com.java.concepts.streamapi.list;

import com.java.concepts.pojo.Car;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Checking if the list element matching with any of the conditions
 *
 */
public class AnyMatchStream {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("bmw", 1, "black", 10),
                new Car("audi", 3, "black", 10),
                new Car("lambo", 4, "white", 12),
                new Car("bmw", 2, "white", 12)
        );

        System.out.println("Checking if the list element matching with any of the condition");

        boolean b = cars.stream()
                .anyMatch(c -> c.getModel() > 2);
        System.out.println("Any match - "+b);

    }
}
