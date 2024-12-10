package com.iit.oop.week12.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(FileSystemComponent file) {
        components.add(file);
    }

    public void removeFile(FileSystemComponent file) {
        components.remove(file);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder " + name);
        for(FileSystemComponent file: components) {
            file.showDetails();
        }
    }
}
