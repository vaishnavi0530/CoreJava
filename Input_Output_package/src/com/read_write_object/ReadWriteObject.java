package com.read_write_object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

public class ReadWriteObject {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "ABC");

        try (FileOutputStream fis = new FileOutputStream("employee.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fis)) {

            oos.writeObject(employee);
            System.out.println("Object written successfully.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
}