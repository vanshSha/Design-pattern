package com.LLDProject.V1;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Driver {

    private String name;

    private Location location;

    private Vehicle vehicle;


}
