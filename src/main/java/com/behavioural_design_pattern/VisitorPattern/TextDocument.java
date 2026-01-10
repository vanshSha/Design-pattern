package com.behavioural_design_pattern.VisitorPattern;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
// Concrete Elements
public class TextDocument implements Document {

    private String fileName;
    private int lineCount;

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitText(this);
    }
}
