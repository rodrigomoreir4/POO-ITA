package com.rodrigomoreira.entities;

public class Respectful implements NameFormatter {
    
    private String gender;
    
    public Respectful(String gender) {
        this.gender = gender;
    }

    @Override
    public String formatName(String name, String surname) {
        if (gender.equalsIgnoreCase("male")){
            return "Sr." + surname;
        }
        else if (gender.equalsIgnoreCase("female")){
            return "Sra." + surname;
        }
        else {
            return "Invalid data";
        }
    }
    
}
