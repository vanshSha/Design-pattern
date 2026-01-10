package com.behavioural_design_pattern.VisitorPattern;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
// Concrete Elements
public class WordDocument implements Document {

    private String fileName;
    private String author;

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitWord(this);
    }
}
