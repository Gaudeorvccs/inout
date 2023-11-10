import java.io.FileWriter;
import java.io.File;

class FileWriterAppend {
    public static void writeToFile(String fileName, String str, boolean append) {
        try {
            File thisFile = new File(fileName);
            FileWriter thisFileWriter = null;

            if (append) {
                thisFileWriter = new FileWriter(thisFile, true);
            } else {
                thisFileWriter = new FileWriter(thisFile);
            }
            thisFileWriter.write(str);
            thisFileWriter.close();
        } catch (Exception e) {
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