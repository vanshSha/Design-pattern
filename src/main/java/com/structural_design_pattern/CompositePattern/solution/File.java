package com.structural_design_pattern.CompositePattern.solution;

// Leaf
public class File implements FileSystemComponent{

    private String name;

    public File(String name){
       this.name = name;
    }

    public void showDetails(){
        System.out.println("File : " + name);
    }
}
