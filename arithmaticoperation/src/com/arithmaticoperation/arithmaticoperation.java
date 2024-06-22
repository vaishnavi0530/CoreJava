package com.arithmaticoperation;

public class arithmaticoperation {

    private double operand1; 
    private double operand2;  

    public arithmaticoperation(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double add() {
        return operand1 + operand2;
    }

    public double subtract() {
        return operand1 - operand2;
    }

    public double multiply() {
        return operand1 * operand2;
    }

    public double divide() {
        if (operand2 == 0) {
            System.out.println("Cannot divide by zero");
            return Double.NaN; // Not a Number
        }
        return operand1 / operand2;
    }
}