package com.behavioural_design_pattern.CommandPattern;

public class WithoutCommandPattern {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        BoldButton bb = new BoldButton(te);
        ItalicButton ib = new ItalicButton(te);
        UnderLineText ult = new UnderLineText(te);

        bb.click();
        ib.click();
        ult.click();
    }
}

class TextEditor {

    public void boldText() {
        System.out.println("Text has been bolded.");
    }

    public void italicizeText() {
        System.out.println("Text has been italicized.");
    }

    public void underLineText() {
        System.out.println("Text has been underlined.");
    }
}

// UI Button Classes

class BoldButton {

    private TextEditor editor;

    public BoldButton(TextEditor editor) {
        this.editor = editor;
    }

    public void click() {
        editor.boldText();
    }

}

class ItalicButton {

    private TextEditor editor;

    public ItalicButton(TextEditor editor) {
        this.editor = editor;
    }

    public void click() {
        editor.italicizeText();
    }
}

class UnderLineText {

    private TextEditor editor;

    public UnderLineText(TextEditor editor) {
        this.editor = editor;
    }

    public void click() {
        editor.underLineText();
    }

}