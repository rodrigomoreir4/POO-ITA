package com.rodrigomoreira;

public class InvalidFormatException extends Exception {

    public InvalidFormatException(String message) {
        super(message);
    }

    public static void checkFormat(String line) throws InvalidFormatException {
        
        int count = 0;

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == '-' && line.charAt(i + 1) == '>') {
                count++;
            }
        }
        if (count == 0 || count > 1) {
            throw new InvalidFormatException("Invalid file format!");
        }

    }

}
