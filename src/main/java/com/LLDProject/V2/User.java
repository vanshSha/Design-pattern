package com.LLDProject.V2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
abstract class User {

    protected String name;
    protected String email;
    protected Location location;

    public abstract void notify(String msg);

}
