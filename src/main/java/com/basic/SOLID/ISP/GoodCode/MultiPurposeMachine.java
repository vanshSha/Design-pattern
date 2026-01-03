package com.basic.SOLID.ISP.GoodCode;

import com.basic.SOLID.ISP.BadCode.Document;
import com.basic.SOLID.ISP.BadCode.Machine;

public class MultiPurposeMachine implements Copier, Printer, Scanner {

    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scan document...");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copy document...");
    }

}
