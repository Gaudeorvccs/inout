import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.lang.Exception;

class FileWriteException extends Exception {
    public FileWriteException(String ErrorMsg) {
        System.out.println("Failed to write to file due to and error: \n" + ErrorMsg);
    }
}

class FileWriter2 {
    public static void writeToFile(String fileName, String Str) throws FileWriteException {
        File thisFile = null;
        FileWriter thisFileWriter = null;

        try {
            thisFile = new File(fileName);
            thisFileWriter = new FileWriter(thisFile);
            thisFileWriter.write(Str);
        } catch (IOException e) {
            throw new FileWriteException("Invalid input!");
        } finally {
            // catch any errors preventing closing the file and alert the user.
            try {
                if (thisFile != null) {
                    thisFileWriter.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error writing to file: Error occured attempting to close File access!");
            }

        }

        // System.out.printf("Content written to <%s> successfully.", fileName);
    }

    public static void main(String[] args) {
        String fileName = "sample.txt";
        String sampleContent = " This is sample content";
        try {
            writeToFile(fileName, sampleContent);
        } catch (FileWriteException e) {
            System.out.println("Program Terminated.");
        }
    }
}