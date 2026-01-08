package com.behavioural_design_pattern.TemplateMethodPattern;

public class WithoutTemplateMethod {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();

        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();



    }
}

class CSVParser1{

    public void parse(){
        openFile();
        // CSV Specific Parsing Logic
        System.out.println("Parsing a CSV File");
        closedFile();
    }

    // these 2 methods are duplicated and following same steps
    private void openFile(){
        System.out.println("Opening File ");
    }

    private void closedFile(){
        System.out.println("Closing File ");
    }
}

class JSONParser{

    public void parse(){
        openFile();
        // JSON Specific Parsing Logic
        System.out.println("Parsing a JSON File");
        closedFile();
    }

    private void openFile(){
        System.out.println("Opening File ");
    }

    private void closedFile(){
        System.out.println("Closing File ");
    }
}

