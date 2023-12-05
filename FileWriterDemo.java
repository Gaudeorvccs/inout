import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class FileWriterDemo {
    public static void writeToFile(String fileName, String Str) throws IOException {
        File thisFile = null;
        FileWriter thisFileWriter = null;

        try {
            thisFile = new File(fileName);
            thisFileWriter = new FileWriter(thisFile);
            thisFileWriter.write(Str);
            System.out.printf("Content written to <%s> successfully.", fileName);
        }
        catch (IOException e) {
            System.out.println(e);
            System.out.println("ERROR: Invalid input!");
        }
        finally{
            if(thisFile != null){
                thisFileWriter.close();
            }
        }

    }
    public static void main(String[] args) throws IOException {
        String fileName = "sample.txt";
        String sampleContent = " This is sample content";
        writeToFile(fileName,sampleContent);
    }
}