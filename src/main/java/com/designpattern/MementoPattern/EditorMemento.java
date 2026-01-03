package com.designpattern.MementoPattern;

// Memento Class : Stores the internal state of the TextEditor
public class EditorMemento {

    private String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
