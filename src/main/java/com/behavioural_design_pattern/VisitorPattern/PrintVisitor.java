package com.behavioural_design_pattern.VisitorPattern;

// Concrete Visitor
public class PrintVisitor implements DocumentVisitor {

    @Override
    public void visitPDF(PDFDocument document) {
        System.out.println("Printing PDF: " + document.getFileName());
    }

    @Override
    public void visitWord(WordDocument document) {
        System.out.println("Printing Word: " + document.getFileName());
    }

    @Override
    public void visitText(TextDocument document) {
        System.out.println("Printing: " + document.getFileName());
    }
}
