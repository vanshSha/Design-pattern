package com.behavioural_design_pattern.CommandPattern;

public class CommandPattern {
    public static void main(String[] args) {
        TextEditor1 te = new TextEditor1();

        // Button
        // Decoupled -> One button can do many types of actions, decoupled from the text editor!
        Button button = new Button();
        button.setCommand(new ChangeColour(te));
        button.click();
    }
}

// Command Interface
interface Command{

    void execute();

}

// Button Class logic
class Button {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}

class TextEditor1 {

    public void boldText() {
        System.out.println("Text has been bolded.");
    }

    public void italicizeText() {
        System.out.println("Text has been italicized.");
    }

    public void underLineText() {
        System.out.println("Text has been underlined.");
    }

    public void changeColour(){
        System.out.println("Colour has been changed.");
    }
}

// Concrete class for command
class BoldCommand implements Command{

    private TextEditor1 editor1;
    public BoldCommand(TextEditor1 editor1){
        this.editor1 = editor1;
    }

    @Override
    public void execute() {
        editor1.boldText();
    }
}

class ChangeColour implements Command{

    private TextEditor1 editor1;
    public ChangeColour(TextEditor1 editor1){
        this.editor1 = editor1;
    }

    @Override
    public void execute() {
        editor1.changeColour();
    }
}

