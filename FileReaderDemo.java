import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
 * Author: RetroWes, Editor: Gaudeorvccs
 * Date: 2023-12-05
 * File: FileReaderDemo.java
 * Description: This class is for reading text from files.
 * 
 * -------
 * Methods
 * -------
 * void readFromFile(String fileName): 
 *     Reads and prints every line in a file.
 *     - FileInputStream reads bytes from {fileName}.
 *     - InputStreamReader converts the bytes to characters.
 *     - BufferedReader supplies the readLine() method for outputting each line.
 */

class FileReaderDemo {
    public static void exThrow() throws IOException {
        throw new IOException();
    }

    public static void readFromFile(String fileName) throws IOException {
        // there are several lines of code that could throw an IOException. They will
        // get propogated up to the main method. To test this fact, uncomment the
        // exThrow call.

        FileInputStream file = new FileInputStream(fileName); // COULD THROW FileNotFoundException
        BufferedReader reader = new BufferedReader(new InputStreamReader(file)); // Initializes the reader with a file
                                                                                 // to read from.

        String line;
        while ((line = reader.readLine()) != null) { // readLine COULD THROW IOException
            System.out.println(line);
        } // {line} will be printed until {reader} is empty.
        reader.close(); // Closes the reader to conserve resources. // COULD THROW IOException

        // exThrow();
        // IOException is thrown intentionally for
        // testing purposes if the above line is uncommented.
    }

    public static void main(String[] args) {
        try {
            readFromFile("sample.txt"); // Attempts to read from the file.
        } catch (FileNotFoundException e) {
            System.out.println("Error reading from file: File does not exist.");
        } catch (IOException e) {
            System.out.println("Error reading from file: Could Not Read From File."); // Catches the IOException thrown
                                                                                      // in the method.
        }
    }
}
