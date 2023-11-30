# inout

Authors: Wesley Morgan, Gaudeor Rudmin
Copyright (2023)
##License: MIT
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.



## Description: 

### CSVFileDemo.java:

A demonstration of reading and writing to a comma separated value file. 
Implements static methods to create csv files, read file contents, 
and split file contents into arrays of Strings. 

The main function demonstrates the functionality.

### FileReaderDemo.java:

A demonstration of reading a file. Similar to CSVFileDemo, but simpler. 
Implements a static method to print to console the content of a text file. 
The main method demonstrates the functionality. 

### FileWriterAppend.java:

A demonstration of writing to a file. Implements a function to write to a 
file with an option to append instead of overwriting. It is better to have 
a flag on one method to append than to have two methods because the backend 
filewriter method is structured similarly.

The main method demonstrates the functionality by overwriting a file and 
then appending to the same file.

### FileWriterDemo.java:

Effectively the same as FileWriterAppend.java, but lacks the ability to 
append to a file. Exists because of project requirements.

### Main.java

Unnecessary; Prints out that the project is loaded which gets run 
automatically on compiling in Replit.

### ReportGenerator.java

Demonstrates the ability to create a formatted report given data such as 
that found in a csv file. Main creates a sample report.


