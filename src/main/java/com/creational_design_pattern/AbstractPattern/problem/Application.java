package com.creational_design_pattern.AbstractPattern.problem;

public class Application {
    public static void main(String[] args) {

        // Windows UI
        WindowsButton button = new WindowsButton();
        WindowsScrollBar scrollBar = new WindowsScrollBar();

        button.render();


    }
}

// Problem is that Windows Scroll Bar Should not created with MacBook ScrolBar , Tightly Coupled

// Windows UI Components
class WindowsButton {

    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class WindowsScrollBar {

    public void scroll() {
        System.out.println("Rendering Windows Scroll Bar");
    }
}

// MacBook UI Components
class MacOSButton {

    public void render() {
        System.out.println("Rendering Mac Button");
    }
}


class MacOSScrollBar {

    public void scroll() {
        System.out.println("Rendering Mac Scroll Bar");
    }
}
