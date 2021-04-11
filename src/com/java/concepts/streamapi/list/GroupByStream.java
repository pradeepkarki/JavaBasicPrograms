package com.java.concepts.streamapi.list;

import com.java.concepts.pojo.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStream {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("bmw", 1, "black", 10),
                new Car("audi", 3, "black", 10),
                new Car("lambo", 4, "white", 12),
                new Car("bmw", 2, "white", 12)
        );

        //Group by color
        Map<String, List<Car>> groupBasedOnColor = cars.stream()
                .collect(Collectors.groupingBy(Car::getColor));

        groupBasedOnColor.forEach((s, cars1) -> {
            System.out.println(s);
            System.out.println(cars1);
        });
        
    }
}
