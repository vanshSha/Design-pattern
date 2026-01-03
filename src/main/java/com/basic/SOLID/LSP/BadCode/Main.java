package com.basic.SOLID.LSP.BadCode;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
            file.read(); // work fine
            file.write(); // throwing an exception , violation LSP
    }
}
