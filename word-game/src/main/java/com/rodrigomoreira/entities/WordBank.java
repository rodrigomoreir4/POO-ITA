package com.rodrigomoreira.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordBank {

    private List<String> words;

    public WordBank(String file){
        this.words = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                words.add(line);
            }
        } catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getRandomWord(){
        Random random = new Random();
        int index = random.nextInt(words.size());
        String word = words.remove(index);
        return word;
    }

}
