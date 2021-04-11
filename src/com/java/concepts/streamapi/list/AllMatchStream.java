package com.java.concepts.streamapi.list;

import com.java.concepts.pojo.Car;

import java.util.Arrays;
import java.util.List;

/**
 *
 *Check the elements and  if all element matches the condition
 *
 */
public class AllMatchStream {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car("bmw", 1, "black", 10),
                new Car("audi", 3, "black", 10),
                new Car("lambo", 4, "white", 12),
                new Car("bmw", 2, "white", 12)
        );
        System.out.println("Check the elements and  if all element matches the condition");
        boolean b = cars.stream()
                .allMatch(c -> c.getMilage() < 22);
        System.out.println("Is all matched - "+b);
    }
}
