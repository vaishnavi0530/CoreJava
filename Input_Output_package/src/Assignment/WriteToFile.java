

package Assignment;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try (
            FileWriter fw = new FileWriter("demo1.txt", true); 
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner scanner = new Scanner(System.in)
        ) {
            String input = "";
            System.out.println("Enter lines of text to append to file. Enter '$' to end:");

            while (!(input = scanner.nextLine()).equals("$")) {
                bw.write(input);
                bw.newLine(); // To write a new line after each input
            }

            System.out.println("Text appended to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


