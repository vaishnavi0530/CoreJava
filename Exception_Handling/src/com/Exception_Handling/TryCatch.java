package com.Exception_Handling;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int number = 10 / 0;
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Hello World");

        try {
            division(10, 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            System.out.println("Error: Division by Zero");
        }
    }

    public static void division(int number1, int number2) {
        try {
            System.out.println(number1 / number2);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            // Example with array and stream
            int[] intArray = {1, 2};
            IntStream intStream = null;
            try {
                intStream = Arrays.stream(intArray);
                intStream.sorted().forEach(System.out::println);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                if (intStream != null) {
                    intStream.close();
                }
            }
        }
    }
}
