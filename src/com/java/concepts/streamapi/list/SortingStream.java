package com.java.concepts.streamapi.list;

import com.java.concepts.pojo.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStream {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("bmw", 1, "black", 10),
                new Car("audi", 3, "black", 10),
                new Car("lambo", 4, "white", 12),
                new Car("bmw", 2, "white", 12)
        );


        System.out.println("ssorting string assending");

        //sorting string assending
        cars.stream()
                .sorted(Comparator.comparing(Car::getName))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("sorting string descending");

        //sorting string descending
        cars.stream()
                .sorted(Comparator.comparing(Car::getName).reversed())
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("sorting string with other combination");

        //sorting string descending
        cars.stream()
                .sorted(Comparator.comparing(Car::getName).thenComparing(Car::getColor))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("sorting integer assending");

        //sort integer
        cars.stream()
                .sorted(Comparator.comparing(Car::getModel))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
