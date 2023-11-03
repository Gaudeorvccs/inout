import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * Author: RetroWes
 * Date: 2023-11-03
 * File: FileReaderDemo.java
 * Description: This class is for reading text from files.
 * 
 * -------
 * Methods
 * -------
 * void readFromFile(String fileName): Reads and prints every line in a file.
 */

class FileReaderDemo {
    public static void readFromFile(String fileName) throws IOException {
        BufferedReader reader = null;

        // FileInputStream reads bytes from {fileName}.
        // InputStreamReader converts the bites to characters
        // BufferedReader supplies the readLine() method for outputting each line.
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // {line} will be printed until {reader} is empty.
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
