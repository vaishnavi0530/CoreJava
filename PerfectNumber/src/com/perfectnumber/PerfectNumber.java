package com.perfectnumber;

public class PerfectNumber {
    public static boolean isPerfect(int number) {
        int sum = 1; // Start with 1 as all numbers are divisible by 1
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum == number;
    }
}