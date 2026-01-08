package com.behavioural_design_pattern.MementoPattern;

public class Client {
    public static void main(String[] args) {

        TextOriginator editor = new TextOriginator();
        CareTaker careTaker = new CareTaker(); // History / StateMgmt
        editor.write("A!");
        careTaker.saveState(editor);


        editor.write("B!");
        careTaker.saveState(editor);

        editor.write("C");
        careTaker.saveState(editor);


        // Problem - > Undo the last write !
        careTaker.undo(editor);   //B
        careTaker.undo(editor);  // C

        System.out.println(editor.getContent());
    }
}
