import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * Author: RetroWes
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
    public static void readFromFile(String fileName) throws IOException {
        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));  // Initializes the reader with a file to read from.

        String line;
        while ((line = reader.readLine()) != null) {System.out.println(line);}              // {line} will be printed until {reader} is empty.
        reader.close();                                                                     // Closes the reader to conserve resources.

        throw(new IOException());                                                           // IOException is thrown intentionally for assignment purposes.
    }

    public static void main(String[] args) throws IOException {
        try{readFromFile("sample.txt");                                            // Attempts to read from the file.
        } catch (IOException e){
            System.out.println("Error reading from file: Could Not Read From File.");     // Catches the IOException thrown in the method.
        }
    }
}
