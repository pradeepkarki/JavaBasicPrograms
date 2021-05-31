package com.java.programs.faq;

public class ReverseStringV1 {
    public static void main(String[] args) {
        String str="String";
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str);

        System.out.print(strBuilder.reverse());
    }
}
