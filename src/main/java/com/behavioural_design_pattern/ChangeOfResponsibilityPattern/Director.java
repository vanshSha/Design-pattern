package com.behavioural_design_pattern.ChangeOfResponsibilityPattern;

// Concrete Handler
public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("Director handling: " + request.getDescription());
    }
}
