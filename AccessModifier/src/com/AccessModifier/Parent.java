package com.AccessModifier;

public class Parent {    //It can be public,private,protected and default.
	
	private int number; //This variable can be public,private,protected and default. It can also be static or non static
	private static int number2;
	
	
	
	public  Parent() {   //Even this constructor can be public,private,protected and default.
		
	}
 public void parentShow() {
	 System.out.println("Parent show");
 }
 
 public void parentShowTest() {
	 parentShow();
	 number =10;
 }
 
}