package com.rodrigomoreira.entities;

public interface GameMechanics {

    public boolean gameOver();
    public void correctWord(String word, String attempt);
    public int calculateScore();
    public String currentWord();
    public String scramblerWord();

}
