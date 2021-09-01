package com.logging;

// Java Program demonstrating XML Formatter Logging API

// Importing requied libraries
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.XMLFormatter;

// Main class
// XMLFormatterExample1
public class XMLEx {

    // Main driver method
    public static void main(String[] args) throws Exception
    {

        // Creating an object of XMLFormatter class
        XMLFormatter xmlFormatter = new XMLFormatter();

        // Setting level to Info
        LogRecord logRecord = new LogRecord(
                Level.INFO,
                "Logrecord message to be printed in xml file..");

        // We can see the output of LogRecord in
        // logrecordxml.xml file
        FileHandler fileHandler
                = new FileHandler("logrecordxml.xml");
        fileHandler.setFormatter(xmlFormatter);

        // Prepared data is displayed in the
        // logrecordxml.xml file
        fileHandler.publish(logRecord);

        // Lastly releasing out all the records
        // using the flush() method
        fileHandler.flush();
    }
}

