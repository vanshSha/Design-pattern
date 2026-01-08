package com.behavioural_design_pattern.IterationPattern;

public class ClientV1 {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python Book"));

        for(Book book : bookCollection.getBooks()){
            System.out.println(book);
        }

    }
}
