package com.behavioural_design_pattern.VisitorPattern;

// Element (Interface)
public interface Document {

    void accept(DocumentVisitor visitor);

}
