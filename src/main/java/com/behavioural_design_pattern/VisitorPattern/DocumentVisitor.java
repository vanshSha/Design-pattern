package com.behavioural_design_pattern.VisitorPattern;

// Visitor (Interface)
public interface DocumentVisitor {

    void visitPDF(PDFDocument document);

    void visitWord(WordDocument document);

    void visitText(TextDocument document);
}
