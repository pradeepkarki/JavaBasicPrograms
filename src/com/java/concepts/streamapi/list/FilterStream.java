package com.java.concepts.streamapi.list;

import com.java.concepts.pojo.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("bmw", 1, "black", 10),
                new Car("audi", 2, "black", 10),
                new Car("lambo", 3, "white", 12),
                new Car("bmw", 4, "white", 12)
        );


        //Filter
        cars.stream()
                .filter(c -> c.getColor().equals("black"))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
