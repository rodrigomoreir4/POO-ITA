package com.rodrigomoreira.entities;

public class InvertString implements Scrambler {

    @Override
    public String shuffle(String word){
        return new StringBuilder(word).reverse().toString();   
    }

}
