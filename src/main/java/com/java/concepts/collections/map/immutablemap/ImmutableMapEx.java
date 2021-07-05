package com.java.concepts.collections.map.immutablemap;

import com.google.common.collect.ImmutableMap;

public class ImmutableMapEx {

    public static void main(String[] args) {
        // Create ImmutableMap using of()
        ImmutableMap<Integer, String> immutableMap = ImmutableMap.of(
                1, "Geeks",
                2, "For",
                3, "Geeks");

        // Print the ImmutableMap
        System.out.println(immutableMap);
    }
}
