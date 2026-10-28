import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Ask for the story filename
        System.out.println("Enter the name of a story you want: ");
        // Reads user input and removes extra spaces, adds .txt to create file name
        String fileName = read.nextLine().trim() + ".txt";
        int lineNumber = 1; // Keeping track of line numbers

        try {
            // Creating buffered reader
            BufferedReader reader = new BufferedReader((new FileReader("src/main/resources/"
                    + fileName))); // opens file located in src/main/resources
            String line; // Storing each line from the file
            // Reads until the end of the file
            while ((line = reader.readLine()) !=null) { // Continues read while there are still lines
                System.out.println(lineNumber + ", " + line); // Line number followed by text from file
                lineNumber++; // incrementing lineNumber
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        read.close();
    }
}
