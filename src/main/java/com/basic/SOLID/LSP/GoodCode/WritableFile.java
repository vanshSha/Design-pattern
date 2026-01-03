package com.basic.SOLID.LSP.GoodCode;

// this class support read and write function
public class WritableFile extends ReadableFile implements Writable{

    public void write(){
        System.out.println("Write to a file ...");
    }
}
