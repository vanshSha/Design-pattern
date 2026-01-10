package com.behavioural_design_pattern.ChangeOfResponsibilityPattern;

// Handler(Abstract class / Interface)
public abstract class Handler {

    protected Handler nextHandler;

    public void setNext(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Request request);
}
