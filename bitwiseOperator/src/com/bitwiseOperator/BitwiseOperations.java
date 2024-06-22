package com.bitwiseOperator;

public class BitwiseOperations {
    private int operand1;
    private int operand2;

    // Setter methods
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    // Getter methods
    public int getOperand1() {
        return operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    // Bitwise AND operation
    public int bitwiseAND() {
        return operand1 & operand2;
    }

    // Bitwise OR operation
    public int bitwiseOR() {
        return operand1 | operand2;
    }

    // Bitwise XOR operation
    public int bitwiseXOR() {
        return operand1 ^ operand2;
    }

    // Bitwise NOT operation
    public int bitwiseNOT(int operand) {
        return ~operand;
    }

    // Left shift operation
    public int leftShift(int operand, int shiftCount) {
        return operand << shiftCount;
    }

    // Right shift operation
    public int rightShift(int operand, int shiftCount) {
        return operand >> shiftCount;
    }

    public static void main(String[] args) {
        BitwiseOperations bitwiseOp = new BitwiseOperations();

        // Set operands
        bitwiseOp.setOperand1(5);
        bitwiseOp.setOperand2(3);

        // Perform bitwise AND operation
        System.out.println("Bitwise AND: " + bitwiseOp.bitwiseAND());

        // Perform bitwise OR operation
        System.out.println("Bitwise OR: " + bitwiseOp.bitwiseOR());

        // Perform bitwise XOR operation
        System.out.println("Bitwise XOR: " + bitwiseOp.bitwiseXOR());

        // Perform bitwise NOT operation
        System.out.println("Bitwise NOT of operand 1: " + bitwiseOp.bitwiseNOT(bitwiseOp.getOperand1()));

        // Perform left shift operation
        System.out.println("Left shift of operand 1 by 2: " + bitwiseOp.leftShift(bitwiseOp.getOperand1(), 2));

        // Perform right shift operation
        System.out.println("Right shift of operand 1 by 2: " + bitwiseOp.rightShift(bitwiseOp.getOperand1(), 2));
    }
}
