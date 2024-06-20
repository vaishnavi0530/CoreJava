package com.functionalinterface;

public class MainArithmaticOperation1 {

	public static void main(String[] args) {
		ArithmaticOperation addition = (number1, number2) -> number1 + number2;
		ArithmaticOperation subtraction = (number1, number2) -> number1 - number2;
		ArithmaticOperation multiplication = (number1, number2) -> number1 * number2;
		ArithmaticOperation division = (number1, number2) -> number1 / number2;

		System.out.println(addition.operation(30, 20));
		System.out.println(subtraction.operation(30, 20));
		System.out.println(multiplication.operation(30, 20));
		System.out.println(division.operation(30, 20));

	}

}