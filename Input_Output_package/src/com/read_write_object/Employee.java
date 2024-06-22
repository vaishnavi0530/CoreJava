package com.read_write_object;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int EmployeeID;
    private String Name;

    @Override
    public String toString() {
        return "Employee [EmployeeID=" + EmployeeID + ", Name=" + Name + "]";
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Employee(int employeeID, String name) {
        super();
        EmployeeID = employeeID;
        Name = name;
    }
}