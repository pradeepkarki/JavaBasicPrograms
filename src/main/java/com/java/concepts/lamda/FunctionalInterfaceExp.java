package com.java.concepts.lamda;

@FunctionalInterface
interface MyFunctunalInterface {
    public int addMethod(int a, int b);
}

public class FunctionalInterfaceExp {

    public static void main(String[] args) {
        MyFunctunalInterface fun = (a, b) -> a + b;
        int i = fun.addMethod(1, 2);
        System.out.println(i);
    }

}
