package com.java.concepts.exeception;

public class ExceptionExample {
    public static void main(String args[]) {
        test1();
    }

    public static void test1() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e0) {
            System.out.println("Ex0 caught");
        } catch (Exception e) {
            System.out.println("exception caught");
        }
    }

    public static void test2() {
        try {
            int n = 1000, x = 0;
            int arr[] = new int[n];
            for (int i = 0; i <= n; i++) {
                arr[i] = i / x;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("1st block = ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException exception) {
            System.out.println("2nd block = ArithmeticException");
        } catch (Exception exception) {
            System.out.println("3rd block = Exception");
        }
    }
}
