package com.bitwiseOperator;

public class SwapNumber {
    private int num1;
    private int num2;

    // Default constructor
    public SwapNumber() {
        num1 = 0;
        num2 = 0;
    }

    // Parameterized constructor
    public SwapNumber(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to swap using a third variable
    public void swapWithThirdVariable() {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    // Method to swap without using a third variable
    public void swapWithoutThirdVariable() {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
    }

    // Method to display the numbers
    public void displayNumbers() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

    public static void main(String[] args) {
        // Testing the class
        SwapNumber swapObj = new SwapNumber(5, 10);

        System.out.println("Before swapping:");
        swapObj.displayNumbers();

        swapObj.swapWithThirdVariable();
        System.out.println("\nAfter swapping with third variable:");
        swapObj.displayNumbers();

        swapObj.swapWithoutThirdVariable();
        System.out.println("\nAfter swapping without third variable:");
        swapObj.displayNumbers();
    }
}