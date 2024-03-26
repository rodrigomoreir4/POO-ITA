package com.rodrigomoreira.entities;

import java.util.Random;

public class ScramblerFactory {

    public static Scrambler createScrambler(){
        Random random = new Random();
        if (random.nextBoolean()){
            return new InvertString();
        } else {
            return new SwapRandomly();
        }
    }

}
