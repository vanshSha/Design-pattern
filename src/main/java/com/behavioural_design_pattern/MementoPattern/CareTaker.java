package com.behavioural_design_pattern.MementoPattern;

import java.util.Stack;

// CareTaker Class : Manages mementos (snapshots of the TextEditor state)
public class CareTaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextOriginator editor){
            history.push(editor.save());
    }

    public void undo(TextOriginator editor){
        if(!history.isEmpty()){
            history.pop();
            editor.restore(history.peek());
        }
    }
}
