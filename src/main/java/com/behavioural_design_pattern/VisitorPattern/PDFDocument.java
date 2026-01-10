package com.behavioural_design_pattern.VisitorPattern;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
// Concrete Elements
public class PDFDocument implements Document {

    private String fileName;
    private int pageCount;

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitPDF(this);
    }
}
