package com.behavioural_design_pattern.MementoPattern;

// Originator
public class TextOriginator {

    private String content;

    public void write(String text){
        this.content = text;
    }

    public String getContent(){
        return content;
    }

    //Save the current state of editor
    public EditorMemento save(){
        return new EditorMemento(content);
    }

    // restore functionality (Memento -> update the state of current content)
    public void restore (EditorMemento memento){
        content = memento.getContent();
    }
}
