package com.rodrigomoreira;

public class EmptyFileException extends Exception{
    
    public EmptyFileException(){
        super("Empty file!");
    }

    public static void checkFormat(String line) throws EmptyFileException {
        
        if(line.length() == 0){
            throw new EmptyFileException();
        }
    
    }

}

