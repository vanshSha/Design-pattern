package com.structural_design_pattern.CompositePattern.problem;

public class FileSystemApp {
    public static void main(String[] args) {

        File file1 = new File("File.txt");
        File file2 = new File("File.txt");

        Folder folder = new Folder("Documents");
        folder.addFile(file1);
        folder.addFile(file2);

        folder.showDetails();

    }
}
