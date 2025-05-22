import java.util.*;
import java.io.*;

public class Filewriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string to write to file: ");
        String userInput = sc.nextLine();

        try {
            // Create FileWriter to write to output.txt
            FileWriter writer = new FileWriter("output.txt");

            // Write the user input to file
            writer.write(userInput);
            writer.close();  // Always close the writer

            System.out.println("Data has been written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
