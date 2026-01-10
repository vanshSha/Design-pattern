package com.behavioural_design_pattern.ChangeOfResponsibilityPattern;

// Concrete Handler
public class SupportAgent extends  Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() <= 1){
            System.out.println("Support Agent Handling: " + request.getDescription());
        }else {
            if(nextHandler!= null){
                nextHandler.handleRequest(request);
            }
        }
    }
}
