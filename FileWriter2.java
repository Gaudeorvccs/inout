import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class FileWriter2 {
    public static void writeToFile(String fileName, String Str) throws IOException {
        File thisFile = null;
        FileWriter thisFileWriter = null;

        try {
            thisFile = new File(fileName);
            thisFileWriter = new FileWriter(thisFile);
            thisFileWriter.write(Str);
        } catch (IOException e) {
            System.out.println(e); // Error writing to file: [error message].
            System.out.println("Error writing to file: Invalid input!");
            return;
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

    public static void main(String[] args) throws IOException {
        String fileName = "sample.txt";
        String sampleContent = " This is sample content";
        writeToFile(fileName, sampleContent);
    }
}