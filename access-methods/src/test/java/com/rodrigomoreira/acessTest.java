package com.rodrigomoreira;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rodrigomoreira.entities.Person;

public class acessTest {

    Person rodrigo = new Person(LocalDate.of(1992, 11, 22));

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStream(){
        System.setOut(originalOut);
    }

    @Test
    void ageTest(){
        rodrigo.getAge();
        assertEquals("Your age is: 31 years.", outContent.toString().trim());
    }

    @Test
    void signTest(){
        rodrigo.getSign();
        assertEquals("Your sign is Sagittarius!", outContent.toString().trim());
    }

}
