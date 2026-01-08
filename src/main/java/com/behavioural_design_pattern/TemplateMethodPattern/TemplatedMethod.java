package com.behavioural_design_pattern.TemplateMethodPattern;

public class TemplatedMethod {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        DataParser jsonParser = new JSONParserII();

        csvParser.parse();
        jsonParser.parse();

    }
}

// Abstract Class - Base class
abstract class DataParser {

    // Template Method Define the steps of the algorithm
    public final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    // Template Method - non override method
    protected void openFile() {
        System.out.println("Opening File ");
    }

    // Template Method - non override method
    protected void closeFile() {
        System.out.println("Closing File ");
    }

    // Hook Methods -
    // Abstract Methods use by concrete method
    protected abstract void parseData();
}

// JSON Parser -- Concrete class extends Abstract class
class JSONParserII extends DataParser {

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON Data ");
    }
}

// CSV Parser -- Concrete class
class CSVParser extends DataParser {

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV Data");
    }
}
