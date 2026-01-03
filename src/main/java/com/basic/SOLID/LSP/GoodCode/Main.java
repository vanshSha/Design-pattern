package com.basic.SOLID.LSP.GoodCode;

public class Main {

    public static void readAnyFile(ReadableFile readableFile){
        readableFile.read();
    }

    public static void main(String[] args){

        // This class have only 1 functionality
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        // this class have 2 functionality of read and write
        WritableFile writableFile = new WritableFile();
        writableFile.write();
        writableFile.read();

        readAnyFile(readableFile);
        readAnyFile(writableFile);

    }
}
