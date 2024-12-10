package com.iit.oop.week12.Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        TextFile file1 = new TextFile("file1.txt");
        TextFile file2 = new TextFile("file2.txt");
        TextFile file3 = new TextFile("file3.txt");

        Folder folder1 = new Folder("Folder A");
        Folder folder2 = new Folder("Folder b");
        Folder mainFolder = new Folder("Main Folder");

        folder1.addFile(file1);
        folder1.addFile(file2);
        folder2.addFile(file3);

        mainFolder.addFile(folder1);
        mainFolder.addFile(folder2);

        mainFolder.showDetails();


    }
}
