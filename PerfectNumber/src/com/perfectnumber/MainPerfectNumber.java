package com.perfectnumber;

public class MainPerfectNumber {
    public static void main(String[] args) {
        int number = 6; //Number for input can be used here.
        
        if (PerfectNumber.isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}


//create employee class with parameter of name,salary and ID. map nameArray to Salary OR ID, bubble sort it.