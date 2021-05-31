package com.java.concepts.streamapi.list;

import com.java.concepts.pojo.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Returns the maximum element of this stream according to the provided Comparator
 *
 *
 */
public class MaxMinStream {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("bmw", 1, "black", 10),
                new Car("audi", 3, "black", 10),
                new Car("lambo", 4, "white", 12),
                new Car("bmw", 2, "white", 12)
        );

        System.out.println("Returns the maximum element of this stream according to the provided Comparator");

        //Max millage car from list
        cars.stream()
                .max(Comparator.comparing(Car::getMilage))
                .ifPresent(System.out::println);

        System.out.println("-------------------------------------------------------------");

        //min millage car from list
        cars.stream()
                .min(Comparator.comparing(Car::getMilage))
                .ifPresent(System.out::println);

    }
}
