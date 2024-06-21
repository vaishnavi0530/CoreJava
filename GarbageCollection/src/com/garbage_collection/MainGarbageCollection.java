package com.garbage_collection;

public class MainGarbageCollection {
    
	@Override
    public void finalize() throws Throwable {
		   System.out.println("Garbage Collection");
		   super.finalize();
     
    }

    public static void main(String[] args) {
        printStudent();
        
        System.gc();
    }

    public static void printStudent() {
        Student student1 = new Student();
        student1 = null;
        System.out.println(student1); 
    }
}