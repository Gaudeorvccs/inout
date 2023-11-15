/*
 * Author: Gaudeor Rudmin
 * Date: 11/15/23
 * File: CSVFileDemo.java
 * Goal:
 * Lab Exercise 4: Working with CSV Files

 *	Create a new program named CSVFileDemo.
 *	Make sure to import the following:
 *	import java.io.*;
 *	import java.util.ArrayList;
 *	import java.util.Arrays;
 *	import java.util.List;
 *	Create a method named writeCSV that writes an array of strings (representing a row of a CSV file) to a CSV file. Use commas to separate the elements and a newline to separate rows.
 *	Create a method named readCSV that reads from a CSV file and prints each row as an array of strings.
 *	Test your methods by creating a small CSV file and then reading from it.


 * Description: 
 * 
 * -------
 * Methods
 * -------
 *  void writeCSV( String fileName, String[] inputStrs, optional:append=true)   
 *      writes a line to the end of a csv file, or overwrites the file if append is false.
 *  String[] getCSVLines(String fileName)
 *      returns an array of lines from a csv file
 *  String[] lineSplitter(String line)
 *      splits a line into an array of strings
 *  void readCSV(String fileName)
 *      reads a CSV file and outputs the contents to the terminal
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList; // import the ArrayList class

public class CSVFileDemo {

    public static void writeCSV(String fileName, String[] inputStrs, boolean append) {
        String line = "";
        for (int i = 0; i < inputStrs.length; i++) {
            line += inputStrs[i];
            if (i < inputStrs.length - 1) {
                line += ",";
            }
        }
        line += "\n";
        FileWriterAppend.writeToFile(fileName, line, append);
    }

    public static void writeCSV(String fileName, String[] inputStrs) {
        writeCSV(fileName, inputStrs, true);
    }

    // by Retrowes, from FileReaderDemo, adapted by Gaudy to return the lines
    public static String[] getCSVLines(String fileName) throws IOException {

        BufferedReader reader = null;

        // FileInputStream reads bytes from {fileName}.
        // InputStreamReader converts the bytes to characters.
        // BufferedReader supplies the readLine() method for outputting each line.
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // {line} will be printed until {reader} is empty.
        String line;
        ArrayList<String> lines = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        String[] arrLines = new String[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            arrLines[i] = lines.get(i);
        }
        return arrLines;
    }

    // splits a string at commas to return an array of Strings
    public static String[] lineSplitter(String line) {
        return line.split(",", -1);
    }

    // prints the contents of a file
    public static void readCSV(String fileName) {
        try {
            String[] lines = getCSVLines(fileName);
            System.out.println("CSV content:");
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                String[] lineArr = lineSplitter(line);
                System.out.println(Arrays.toString(lineArr));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // file name to write to
        String fileName = "testCSV.csv";
        // write the test data
        writeCSV(fileName, new String[] { "Name", "Age", "Grade" });
        writeCSV(fileName, new String[] { "Alice", "23", "A" });
        writeCSV(fileName, new String[] { "Bob", "24", "B" });

        readCSV(fileName);
    }
}
