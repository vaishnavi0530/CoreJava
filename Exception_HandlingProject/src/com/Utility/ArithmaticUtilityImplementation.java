package com.Utility;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.ArithmaticOperation.ArithmaticUtilityInterface;
import com.enumeration.Menu;

public class ArithmaticUtilityImplementation implements ArithmaticUtilityInterface {

    public int printMenu(Scanner scanner) {
        int choice = 0;
        for (Menu menu : Menu.values()) {
            System.out.println(menu.getSrNo() + ", " + menu.name() + "(" + menu.getInfo() + ")");
        }
        try {
            choice = scanner.nextInt(); // Corrected to use scanner provided as argument
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a valid number.");
            scanner.nextLine(); // Consume the invalid input to clear the scanner buffer
        }
        return choice;
    }

    public void addition(Scanner scanner) {
        System.out.println("Enter two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 + number2;
        System.out.println("Result: " + result);
    }

    public void subtraction(Scanner scanner) {
        System.out.println("Enter two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 - number2;
        System.out.println("Result: " + result);
    }

    public void multiplication(Scanner scanner) {
        System.out.println("Enter two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 * number2;
        System.out.println("Result: " + result);
    }

    public void division(Scanner scanner) {
        System.out.println("Enter two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number2 == 0) {
            System.out.println("Error: Division by zero");
        } else {
            int result = number1 / number2;
            System.out.println("Result: " + result);
        }
    }
}
