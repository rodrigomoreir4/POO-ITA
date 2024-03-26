package com.rodrigomoreira.entities;

import java.util.Random;

public class SwapRandomly implements Scrambler {

    @Override
    public String shuffle(String word) {
    char[] chars = word.toCharArray();
    Random random = new Random();
    for (int i = chars.length - 1; i > 0; i--) {
        int j = random.nextInt(i + 1);
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    return new String(chars);

    }
    
}
