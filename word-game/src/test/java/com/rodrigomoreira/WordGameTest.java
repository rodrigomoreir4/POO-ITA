package com.rodrigomoreira;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.rodrigomoreira.entities.InvertString;
import com.rodrigomoreira.entities.Scrambler;
import com.rodrigomoreira.entities.SwapRandomly;

public class WordGameTest {
    
    String word = "rodrigo";
    String word2 = "";

    @Test
    void testInvertString(){
        Scrambler invert = new InvertString();
        word2 = invert.shuffle(word);
        assertEquals("ogirdor", word2);
    }

    @Test
    void testSwapRandomly(){
        Scrambler swap = new SwapRandomly();
        word2 = swap.shuffle(word);
        assertNotEquals(swap, word2);
    }

}
