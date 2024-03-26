package com.rodrigomoreira.entities;

public class SimpleMechanics implements GameMechanics {

    private static final int numberOfWords = 10;
    private int wordsCounter = 0;
    private int score = 0;

    private WordBank bank;
    private Scrambler scrambler;
    private String currentWord;

    public SimpleMechanics(WordBank bank, Scrambler scrambler) {
        this.bank = bank;
        this.scrambler = scrambler;
    }

    @Override
    public boolean gameOver() {
        wordsCounter++;
        return wordsCounter > numberOfWords;
    }

    @Override
    public void correctWord(String word, String attempt) {
        if (currentWord.equalsIgnoreCase(attempt)){
            score++;
        } 
    }

    @Override
    public int calculateScore(){
        return score;
    }

    @Override
    public String currentWord() {
        return currentWord;
    }

    @Override
    public String scramblerWord(){
        currentWord = bank.getRandomWord();
        return scrambler.shuffle(currentWord);
    }

}
