import java.io.*;
import java.util.*;

public class Filereader {
    public static void main(String[] args) {
        try {
            // Create a FileReader wrapped in BufferedReader for efficient reading
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            String line;
            System.out.println("Contents of output.txt:");
            // Read each line until EOF (null)
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close(); // Close the reader
        } catch (FileNotFoundException e) {
            System.out.println("File not found: output.txt");
        } catch (IOException e) {
            System.out.println("Error reading from file.");
            e.printStackTrace();
        }
    }
}
