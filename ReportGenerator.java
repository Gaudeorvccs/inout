import java.io.PrintWriter;
import java.sql.Time;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileNotFoundException;

/*
 * Author: RetroWes
 * Date: 2023-11-28
 * File: FileReaderDemo.java
 * Description: This class is for generating staff reports.
 * 
 * -------
 * Methods
 * -------
 * static void generateReport(String fileName, List<String[]> data):
 *      Writes {data} to {fileName} in a grid format.
 * 
 * static String getDateAndTime():
 *      Returns the local date and time, formatted, as a String.
 */

class ReportGenerator{
    static void generateReport(String fileName, List<String[]> data){
        PrintWriter printWriter = null;                                         // Instantiates a PrintWriter.
        String dashedLine = "-----------------------------------------";        // Used to separate the grid into a header, body, and footer. 

        try{ printWriter = new PrintWriter(fileName);}                          // Attempt to assign {printWriter} with {fileName}'s output stream} 
        catch(FileNotFoundException e){
            System.out.print("ERROR: Could not write to the specifiedfile!");
        }
        
        for(int row = 0; row < data.size(); row++){                             // Iterates through all rows.
            for(int column = 0; column < data.get(row).length; column++){       // Iterates through all columns of a row.
                int columnWidth = column > 0 ? -15 : -5;                        // Change column width depending on
                String formatSpecifier = "%" + columnWidth + "s";               // Flexible format specifier.
                printWriter.printf(formatSpecifier, data.get(row)[column]);     // Prints the data in the cell at the row-column intersection along with a tab.
            }
            printWriter.println();                                              // A line will separate each row.
            if(row == 0) {printWriter.println(dashedLine);}                     // Separates header from body.
        }
        printWriter.println(dashedLine);                                        // Separates body from footer.
        printWriter.print("Generated on: " + getDateAndTime());                 // Footer message displaying when the report was generated.
        printWriter.close();                                                    // Close {printWriter} to prevent resource leakage.
    }

    static String getDateAndTime(){                                             // Gets the local date and time so that it can be output as a String.
        LocalDateTime localDateTime = LocalDateTime.now();                      // Stores the current local date and time.
        DateTimeFormatter dateTimeFormatter =                                   // Template for formatting the date and time.
             DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");    

        return localDateTime.format(dateTimeFormatter);                         // Returns {localDateTime} formatted with th {dateTimeFormatter} template.
    }

    public static void main(String[] args){
        List<String[]> data = List.of(                                          // Example Data
            new String[]{"ID", "Name",         "Role",       "Salary"},
            new String[]{"1",  "Alice Smith",  "Developer",  "$80000"},
            new String[]{"2",  "Bob Johnson",  "Manager",    "$95000"},
            new String[]{"3",  "Charlie Lee",  "Analyst",    "$70000"});

        generateReport("testFile.txt", data);                          // Primary Function Call
    }
}