import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVFileDemo {
    public static void writeCSV(String[] input) {
        String line = "";
        for (int i=0;i<input.length;i++) {
            line += input[i];
            if (i<input.length - 1) {
                line += ",";
            }
        }
        line += "\n";
        FileWriterAppend.writeToFile()

    }

    public static void main(String[] args) {

    }
}
