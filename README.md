See Readme in Inout: https://github.com/Gaudeorvccs/inout/blob/Inout/README.md
for basic class descriptions. 

1) Changes FileWriterDemo to handle IOException and print better error message

2) Creates a copy of FileWriterDemo as FileWriter2 to handle exceptions better with a custom Exception FileWriteException
Handles this new exception in the main method.

3) Changes the FileReaderDemo program to propogate Exceptions up to the main method.

4) Changes the CSVFileDemo program to handle FileNotFoundException and IOException in 
writeCSV and getCSVLines methods. Note that exception handling is better suited to 
getCSVLines than readCSV since readCSV calls getCSVLines.
