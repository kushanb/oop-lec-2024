package com.iit.oop.week12.Composite;

public class TextFile implements FileSystemComponent {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + this.name);
    }
}
