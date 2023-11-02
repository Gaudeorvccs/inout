import java.io.FileWriter;
import java.io.File;
class FileWriterDemo {
    public static void writeToFile(String fileName, String Str) {
        try {
            File thisFile = new File(fileName);
            FileWriter thisFileWriter = new FileWriter(thisFile);
            thisFileWriter.write(Str);
            thisFileWriter.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

    }
    public static void main(String[] args) {
        String fileName = "sample.txt";
        String sampleContent = "This is sample content";
        writeToFile(fileName,sampleContent);
        System.out.println("Content written to file successfully.");
    }
}