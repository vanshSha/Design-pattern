package com.structural_design_pattern.CompositePattern.solution;


public class FileSystemApp {
    public static void main(String[] args) {

        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");
        Folder folder = new Folder("Documents");
        folder.addComponent(file1);
        folder.addComponent(file2);

        // Sub Folder
        Folder subFolder = new Folder("SubFolder");
        FileSystemComponent file3 = new File("File3.txt");

        subFolder.addComponent(file3);
        folder.addComponent(subFolder);

        folder.showDetails();
    }
}

/*
- Files are uniform  even files and folder structures are different
- Scalability
 */