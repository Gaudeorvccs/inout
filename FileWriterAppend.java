import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/*
 * Author: RetroWes
 * Date: 11/9/2023
 * File: FileWriterAppend
 * Description: This class contains a method for writing to a file.
 * 
 * -------
 * Methods
 * -------
 * public static void writeToFile(String fileName, String str, boolean append): 
 *      Writes {str} to {fileName}. If {append == true}, {str} is appended to {fileName}.
 */

class FileWriterAppend {
    public static void writeToFile(String fileName, String str, boolean append) {
        try {
            File thisFile = new File(fileName);
            FileWriter thisFileWriter = null;

            // If {append == true}, appends {str} to {fileName}. If {append == false}, text
            // in {fileName} is overwritten with {str}.
            thisFileWriter = new FileWriter(thisFile, append);

            // The file is written to and the FileWriter object is closed to save resources.
            thisFileWriter.write(str);
            thisFileWriter.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "sample.txt";
        String sampleContent = "This is sample content\n";
        String appendContent = "This is appended content\n";
        writeToFile(fileName, sampleContent, false);
        writeToFile(fileName, appendContent, true);
        System.out.println("Content written to file successfully.");
    }
}