package com.behavioural_design_pattern.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        //a.1 Object Structure (Optional but Common)
        PDFDocument pdfDoc = new PDFDocument("report.pdf", 12);
        WordDocument wordDoc = new WordDocument("letter.docx", "John Deer");
        TextDocument textDoc = new TextDocument("notes.txt", 3);

        // a.2
        List<Document> documents = new ArrayList<>();
        documents.add(pdfDoc);
        documents.add(wordDoc);
        documents.add(textDoc);

        // a.3
        System.out.println("Compress Operation");
        DocumentVisitor compressVisitor = new CompressVisitor();
        for (Document compress : documents) {
            compress.accept(compressVisitor);
        }
        System.out.println();

        System.out.println("Export Operation");
        DocumentVisitor exportVisitor = new ExportVisitor();
        for (Document export : documents) {
            export.accept(exportVisitor);
        }
        System.out.println();

        System.out.println("Print Operation");
        DocumentVisitor printVisitor = new PrintVisitor();
        for (Document print : documents) {
            print.accept(printVisitor);
        }
        System.out.println();
    }
}
