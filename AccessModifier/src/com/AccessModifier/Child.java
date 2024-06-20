package com.AccessModifier;

public class Child {   // Outer class: It can be only public or package-private (default)

    protected class InnerClass {    // Inner class: It can be protected, default, public, or private.
        
    }
    
    public void childDisplay() {
        System.out.println("Display child");
    }
    
    // Define childShow() method outside of childDisplay()
    public void childShow() {
        Parent parent = new Parent();
        
    }
}
//Protected can be accessed to different package, but only when its CHILD CLASS. 
//Private can be accessed, ONLY IN SAME CLASS, and SAME PACKAGE.