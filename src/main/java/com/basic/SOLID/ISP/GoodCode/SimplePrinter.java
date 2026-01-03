package com.basic.SOLID.ISP.GoodCode;

import com.basic.SOLID.ISP.BadCode.Document;

public class SimplePrinter implements Printer {

    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }
}
