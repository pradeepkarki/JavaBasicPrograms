package com.java.programs.datamanipulation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DateSort {

    public static void main(String[] args) {

        List<String> datestring= Arrays.asList("03/07/2021","03/05/2021");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yyyy");

        datestring.sort(Comparator.comparing(s -> LocalDateTime.parse(s, formatter)));
    }
}
