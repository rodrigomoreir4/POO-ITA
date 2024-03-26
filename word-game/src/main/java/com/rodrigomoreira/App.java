package com.rodrigomoreira;

import java.util.Scanner;

import com.rodrigomoreira.entities.GameMechanics;
import com.rodrigomoreira.entities.GameMechanicsFactory;
import com.rodrigomoreira.entities.WordBank;

public final class App {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String path = "file.txt";
        WordBank bank = new WordBank(path);

        System.out.print("Changed level Y or N? ");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        sc.nextLine();
        boolean level;
        if (ch == 'y'){
            level = true;
        } else {
            level = false; 
        }

        GameMechanics mechanics = GameMechanicsFactory.createGameMechanics(bank, level);

        while(!mechanics.gameOver()){
            String word = mechanics.currentWord();
            String scramblerWord = mechanics.scramblerWord();
            System.out.println(scramblerWord);
            System.out.print("Answer: ");
            String attempt = sc.nextLine();
            mechanics.correctWord(word, attempt);
        }

        System.out.println("Score total: " + mechanics.calculateScore());
        sc.close();
    }

}
