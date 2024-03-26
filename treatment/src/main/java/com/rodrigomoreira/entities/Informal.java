package com.rodrigomoreira.entities;

public class Informal implements NameFormatter {

    @Override
    public String formatName(String name, String surname) {
        return name + " " + surname;
    }
    
}
