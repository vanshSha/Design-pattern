package com.creational_design_pattern.AbstractPattern.solution;

public class Application {

    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory factory) {
        this.button = factory.creationButton();
        this.scrollBar = factory.createScrollBar();
    }

    public void renderUI() {
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        Application application = new Application(new LinuxFactory());
        application.renderUI();

    }
}

// Abstract Factory Interface
interface UIFactory {

    Button creationButton();

    ScrollBar createScrollBar();
}

// AbstractProducts
interface Button {

    void render();
}

// AbstractProducts
interface ScrollBar {

    void scroll();
}

// ConcreteProducts
class WindowsButton implements Button {

    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

// ConcreteProducts
class WindowsScrollBar implements ScrollBar {

    public void scroll() {
        System.out.println("Rendering Windows Scroll Bar");
    }
}

// ConcreteFactory
class WindowsFactory implements UIFactory {

    @Override
    public Button creationButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}

// ConcreteFactory
class MacOSFactory implements UIFactory {

    @Override
    public Button creationButton() {
        return new MacOSButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacOSScrollBar();
    }
}

// ConcreteProducts - MacBook UI Components
class MacOSButton implements Button {

    public void render() {
        System.out.println("Rendering Mac Button");
    }
}

// ConcreteProducts
class MacOSScrollBar implements ScrollBar {

    public void scroll() {
        System.out.println("Rendering Mac Scroll Bar");
    }
}

// ConcreteFactory
class LinuxFactory implements UIFactory {

    @Override
    public Button creationButton() {
        return new LinuxButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new LinuxScrollBar();
    }
}

// ConcreteProducts
class LinuxButton implements Button {

    public void render() {
        System.out.println("Rendering Linux Button");
    }
}

// ConcreteProducts
class LinuxScrollBar implements ScrollBar {

    public void scroll() {
        System.out.println("Rendering Linux Scroll Bar");
    }
}

