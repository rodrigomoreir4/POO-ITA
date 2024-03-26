package com.rodrigomoreira.entities;

public class Status implements NameFormatter {

    private String title;

    public Status(String title) {
        this.title = title;
    }

    @Override
    public String formatName(String name, String surname) {
        return title + " " + name + " " + surname;
    }
    
}
