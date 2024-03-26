package com.rodrigomoreira;

import org.junit.jupiter.api.Test;

import com.rodrigomoreira.entities.Authority;
import com.rodrigomoreira.entities.Informal;
import com.rodrigomoreira.entities.Respectful;
import com.rodrigomoreira.entities.Status;

public class TreatmentTest {
    
    Authority a = new Authority("Rodrigo", "Moreira", new Informal());
    Authority b = new Authority("Joana", "Beatriz", new Respectful("female"));
    Authority c = new Authority("Jasmim", "Moreira", new Status("Miss"));

    @Test
    void informalTest(){
        System.out.println(a.getTreatment());
    }

    @Test
    void respectfulTest(){
        System.out.println(b.getTreatment());
    }

    @Test
    void statusTest(){
        System.out.println(c.getTreatment());
    }

}
