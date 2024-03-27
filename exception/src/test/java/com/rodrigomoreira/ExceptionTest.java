package com.rodrigomoreira;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void InvalidFormatExceptionTest(){
        String s1 = "Rodrigo-Moreira";
        InvalidFormatException exception1 = assertThrows(InvalidFormatException.class, () -> {InvalidFormatException.checkFormat(s1);});
        assertEquals("Invalid file format!", exception1.getMessage());

        String s2 ="Rodrigo->Moreira->";
        InvalidFormatException exception2 = assertThrows(InvalidFormatException.class, () -> {InvalidFormatException.checkFormat(s2);});
        assertEquals("Invalid file format!", exception2.getMessage());
    }

    @Test
    void EmptyFileExceptionTest(){
        String s = "";
        EmptyFileException exception = assertThrows(EmptyFileException.class, () -> {EmptyFileException.checkFormat(s);;});
        assertEquals("Empty file!", exception.getMessage());
    }

    @Test
    void IOExceptionTest(){
        String s = "empty.txt";
        FileProcessor fp = new FileProcessor(s);
        IOException exception = assertThrows(IOException.class, () -> {fp.process(s);});
        assertEquals("Error opening file: " + exception.getMessage(), "Error opening file: " + exception.getMessage());
    }

    @Test
    void FileProcessTest() throws IOException{
        String s = "file.txt";
        FileProcessor fp = new FileProcessor(s);
        assertDoesNotThrow(() -> fp.process(s));
    }

}
