package com.rodrigomoreira.entities;

public class Authority {
    
    private String name;
    private String surname;
    private NameFormatter nameFormatter;

    public Authority(String name, String surname, NameFormatter nameFormatter) {
        this.name = name;
        this.surname = surname;
        this.nameFormatter = nameFormatter;
    }

    public String getTreatment(){
        return nameFormatter.formatName(name, surname);
    }

}
