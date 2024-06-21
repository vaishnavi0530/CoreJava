package com.arithmaticoperation;

public class ArithmaticOperationService {
    public void performOperations(double operand1, double operand2) {
    	arithmaticoperation operation = new arithmaticoperation(operand1, operand2);
        
        System.out.println("Addition: " + operation.add());
        System.out.println("Subtraction: " + operation.subtract());
        System.out.println("Multiplication: " + operation.multiply());
        System.out.println("Division: " + operation.divide());
    }
}