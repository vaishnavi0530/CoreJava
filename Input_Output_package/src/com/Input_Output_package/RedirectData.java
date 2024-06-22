package com.Input_Output_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class RedirectData { 

    public static void main(String[] args) {
        // Input keyboard
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.println("Enter Number: ");
            int number = Integer.parseInt(br.readLine());
            System.out.println(number);

            System.out.println("Enter String: ");
            String inputString = br.readLine();
            System.out.println(inputString);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null) isr.close();
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // File read write operation
        try (Writer fw = new FileWriter("demo.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Any random strings can be written here.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
