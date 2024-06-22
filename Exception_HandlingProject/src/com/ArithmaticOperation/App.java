package com.ArithmaticOperation;

import java.util.Scanner;
import com.Utility.ArithmaticUtilityImplementation;
import com.ArithmaticOperation.ArithmaticUtilityInterface;

public class App {
    public static void main(String[] args) {
        ArithmaticUtilityImplementation helper = new ArithmaticUtilityImplementation();
        int choice = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                choice = helper.printMenu(scanner);
                System.out.println(choice);

                switch (choice) {
                    case 1 -> helper.addition(scanner);
                    case 2 -> helper.subtraction(scanner);
                    case 3 -> helper.multiplication(scanner);
                    case 4 -> helper.division(scanner);
                    case 0 -> System.out.println("Exiting");
                    default -> System.out.println("Invalid Input");
                }

            } while (choice != 0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
