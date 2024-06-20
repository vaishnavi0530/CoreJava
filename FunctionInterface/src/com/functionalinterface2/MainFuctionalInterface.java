package com.functionalinterface2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainFuctionalInterface {
	public static void main(String[] args) {
		Consumer<Float> consumer = amount -> System.out.println(amount);
//Using SCOPE OPERATOR for same line of code, as alternate:	Consumer<Float> consumer = System.out:: println;

		consumer.accept(12.4F);
		consumer.accept(12312.4F);
		consumer.accept(123312.4F);
		consumer.accept(122432.4F);
		consumer.accept(1233123.4F);
		
		System.out.println(); //Just to pass a empty line

		// Example 2
		Consumer<Integer> oddEven = num -> {
			if (num % 2 == 0) {
				System.out.println(num + ": number is even");
			} else {
				System.out.println(num + ": number is odd");
			}
		};

		oddEven.accept(5);
		oddEven.accept(10);
		
		System.out.println(); //Just to pass a empty line
		
		//Example 3
		 Function<Integer, Float> area = radius -> (float) (3.14 * radius * radius);
	        System.out.println(area.apply(10));
	        
	        System.out.println(); //Just to pass a empty line
	        
	        
	      //Example 4
	        Predicate<Integer> checkEven = number -> number % 2 == 0;
	        if (checkEven.test(10)) {
	            System.out.println("Even");
	        } else {
	            System.out.println("Odd");
	        }
	    }
	
	
	}
