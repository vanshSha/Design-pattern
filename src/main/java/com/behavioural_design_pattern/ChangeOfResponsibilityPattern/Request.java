package com.behavioural_design_pattern.ChangeOfResponsibilityPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// Request
public class Request {

    private String type;
    private String description;
    private int priority;

}
